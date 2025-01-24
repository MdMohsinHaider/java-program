package com.jspider.javaprogram.src.practices1.arrays;

/**
 * The Program4 class demonstrates a simple Java program that initializes an array
 * and prints the elements located at even indices. This program showcases basic array
 * handling and index manipulation in Java.
 *
 * <p>Example:
 * <pre>
 * Input: {1, 3, 5, 7, 9, 2, 4, 6, 8, 0}
 * Output:
 * Even index is : 0 and its element is : 1
 * Even index is : 2 and its element is : 5
 * Even index is : 4 and its element is : 9
 * Even index is : 6 and its element is : 4
 * Even index is : 8 and its element is : 8
 * </pre>
 */
public class Program4 {
    /**
     * The main method serves as the entry point of the program.
     * It initializes an integer array and calls the {@link #getEvenIndex(int[])}
     * method to print the elements located at even indices.
     *
     * @param args Command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
        // Initialize an array with sample integers
        int[] array = {1, 3, 5, 7, 9, 2, 4, 6, 8, 0};

        // Call the method to print elements at even indices
        getEvenIndex(array);
    }

    /**
     * Prints the elements of the given integer array that are located at even indices.
     *
     * @param array The array whose even-indexed elements are to be printed
     */
    public static void getEvenIndex(int[] array) {
        // Loop through each index in the array
        for (int i = 0; i < array.length; i++) {
            // Check if the index is even
            if (i % 2 == 0) {
                // Print the even index and the corresponding element
                System.out.println("Even index is : " + i + " and its element is : " + array[i]);
            }
        }
    }
}
