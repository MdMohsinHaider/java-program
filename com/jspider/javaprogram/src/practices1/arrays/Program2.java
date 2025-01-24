package com.jspider.javaprogram.src.practices1.arrays;

/**
 * The Program2 class demonstrates a simple Java program that initializes an array
 * and prints its elements in reverse order. This program showcases basic array handling
 * and iteration techniques in Java.
 *
 * <p>Example:
 * <pre>
 * Input: {1, 3, 5, 7, 9, 2, 4, 6, 8, 0}
 * Output:
 * 0
 * 8
 * 6
 * 4
 * 2
 * 9
 * 7
 * 5
 * 3
 * 1
 * </pre>
 */
public class Program2 {
    /**
     * The main method serves as the entry point of the program.
     * It initializes an integer array and calls the {@link #reverseArray(int[])}
     * method to print its elements in reverse order.
     *
     * @param args Command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
        // Initialize an array with sample integers
        int[] array = {1, 3, 5, 7, 9, 2, 4, 6, 8, 0};

        // Call the method to print the array elements in reverse order
        reverseArray(array);
    }

    /**
     * Prints the elements of the given integer array in reverse order.
     *
     * @param array The array whose elements are to be printed in reverse
     */
    public static void reverseArray(int[] array) {
        // Loop through the array starting from the last element to the first
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]); // Print the current element
        }
    }
}
