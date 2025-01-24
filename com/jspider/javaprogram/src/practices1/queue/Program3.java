package com.jspider.javaprogram.src.practices1.queue;

/*
*
*   Print biggest and second biggest from an array
*
* */


import java.util.*;

public class Program3 {
    public static void main(String[] args) {
        int[] array = {0,2,4,6,8,0,1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9,0,0,9,8,7,6,5,4,3,2,1};
        printBiggestSecondBiggestArrayElement(array);
    }

    private static void printBiggestSecondBiggestArrayElement(int[] array){
        Set<Integer> s1 = new TreeSet<>();
        for (int p:array){
            s1.add(p);
        }
        System.out.println(s1);

        int count = 0;
        Iterator<Integer> itr = s1.iterator();
        int big = 0;
        int second_big = 0;
        while (itr.hasNext()){
            count++;
            int temp = itr.next();
            if (count == 1){
                second_big = temp;
            //  big =temp;
            }else {
                second_big = big;
                big= temp;
            }
        }
        System.out.println(second_big);
        System.out.println(big);
    }
}
