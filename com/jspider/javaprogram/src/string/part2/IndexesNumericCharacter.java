package com.jspider.javaprogram.src.string.part2;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a Java Program to take a String input
 * and print all the indexes where numeric characters
 * are present in the String.
 */
public class IndexesNumericCharacter {
    public static void main(String[] args) {
        String string = "nhs75kjh76y4r72980298yn895";
        List<Integer> integerList = getIndex(string);
        System.out.println("Numeric Characters Index: "+integerList);
    }

    private static List<Integer> getIndex(String string){

        List<Integer> integerList = new ArrayList<>();

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (c>='0' && c <='9'){
                integerList.add(i);
            }
        }
        return integerList;
    }
}
