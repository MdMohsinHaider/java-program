package com.jspider.javaprogram.src.array;

import java.util.Arrays;

public class RotateElementsArrayLeftByNTimes {
    public static void main(String[] args) {
        int[] array = new int[] {1,2,3,4,5};
        int roteTimes = 2;

        for (int i = 0; i <roteTimes ; i++) {
            int firstElement = array[0];
            int j;
            for (j = 0; j <array.length-1 ; j++) {
                array[j] = array[j+1];
            }
            array[j] = firstElement; // j is last index
        }

        System.out.println(Arrays.toString(array));
    }
}
  