package com.jspider.javaprogram.src.array;

/**
 * <h1>Example 15</h1>
 * <li>Design a method to remove an element from a particular position of an array</li>
 */
public class DesignMethodRemoveElementFromParticularPositionArray {
    public static void main(String[] args) {
        int[] array = {12, 34, 56, 7, 8, 89, 90, 10};
        int removeIndex = 2; // Example: remove the element at index 2

        // print Before
        System.out.println("Before: ");
        for (int e : array) {
            System.out.print(e + " ");
        }
        System.out.println("\nOriginal Length: " + array.length);

        array = designMethodRemoveElementFromParticularPositionArray(array, removeIndex);

        // Print After
        System.out.println("After: ");
        for (int e : array) {
            System.out.print(e + " ");
        }
        System.out.println("\nNew Length: " + array.length);
    }

    private static int[] designMethodRemoveElementFromParticularPositionArray(int[] array, int removeIndex) {

        int[] newArray = new int[array.length-1];
        for (int i = 0,j = 0; i <array.length ; i++) {
            if ( i!= removeIndex){
                newArray[j++] = array[i];
            }
        }
        return newArray;
    }
}
