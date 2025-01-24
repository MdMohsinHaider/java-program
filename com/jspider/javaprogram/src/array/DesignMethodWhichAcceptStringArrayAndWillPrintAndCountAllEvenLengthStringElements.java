package com.jspider.javaprogram.src.array;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <h1>Question 12
 */
public class DesignMethodWhichAcceptStringArrayAndWillPrintAndCountAllEvenLengthStringElements {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Orange", "Mango", "Grapes",
                "Pineapple", "Watermelon", "Strawberry", "Kiwi", "Papaya"};

        designMethodWhichAcceptStringArrayAndWillPrintAndCountAllEvenLengthStringElements(fruits);
        String[] a = otherWay(fruits);
        System.out.println("\n"+Arrays.toString(a));
    }

    // print and count even String
    private static void designMethodWhichAcceptStringArrayAndWillPrintAndCountAllEvenLengthStringElements(String[] fruits) {
        int count = 0;
        for (String s : fruits){
            if (s.length()%2 ==0){
                count++;
                System.out.print(s +" ");
            }
        }
        System.out.print("\nCount of total Number of even String is : "+count);
    }

    private static String @NotNull [] otherWay(String @NotNull [] fruits){
        List<String> tempList = new ArrayList<>();
        for (String fruit : fruits) {
            if (fruit.length() % 2 == 0) {
                tempList.add(fruit);
            }
        }
        return tempList.toArray(new String[0]);
    }
}
