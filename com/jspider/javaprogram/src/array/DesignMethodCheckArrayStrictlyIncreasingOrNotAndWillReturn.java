package com.jspider.javaprogram.src.array;

/**
 * <h1>Example 14</h1>
 * <li>Design a method to check if an array is strictly
 * increasing or not and will return.
 */
public class DesignMethodCheckArrayStrictlyIncreasingOrNotAndWillReturn {
    public static void main(String[] args) {
        int[] array1 = {12,34,45,56,67,78,89,90,100,34};
        int[] array2 = {12,34,45,56,67,78,89,90,100,120,230};

        boolean b = designMethodCheckArrayStrictlyIncreasingOrNotAndWillReturn(array1);
        System.out.println(b);
    }

    private static boolean designMethodCheckArrayStrictlyIncreasingOrNotAndWillReturn(int[] array) {
        for (int i = 0; i <array.length-1 ; i++) {
            if (array[i]>=array[i+1])
                return false;
        }
        return true;
    }
}
