package com.jspider.javaprogram.src.array;

public class CalculateAndPrintTheBiggestElementOfAnArray {
    public static void main(String[] args) {

        int[] array = {
                677, 706, 476, 194, 255, 318, 266, 793, 753, 822, 345, 940, 907, 61, 324, 502,
                934, 286, 592, 268, 816, 713, 61, 775, 209, 887, 477, 787, 217, 887, 848,
                123, 456, 789, 101, 202, 303, 404, 505, 753, 502, 268, 816, 822, 911
        };

        calculateAndPrintTheBiggestElementOfAnArray(array);
        int index = otherWay(array);
        System.out.println(index+" => "+array[index]);

    }

    /**
     * Question 7
     * @param array pass Argument in an integer type array.
     */
    private static void calculateAndPrintTheBiggestElementOfAnArray(int[] array) {
        int bigElement= array[0];
        for (int j :array){
            if (j>bigElement)
                bigElement=j;
        }
        System.out.println(bigElement);
    }

    private static int otherWay(int[] array){
        int bigEIndex = 0; // Index of the largest element
        for (int i = 1; i < array.length; i++) { // Start from the second element
            if (array[i] > array[bigEIndex])
                bigEIndex = i; // Update the index if a larger element is found
        }
        return bigEIndex; // Return the index of the largest element
    }
}
