package com.jspider.javaprogram.src.practices.arrays;

/**
 * The Program3 class demonstrates a simple Java program that initializes an array
 * and prints all the even elements. This program showcases basic array handling
 * and conditional logic in Java.
 *
 * <p>Example:
 * <pre>
 * Input: {1, 3, 5, 7, 9, 2, 4, 6, 8, 0}
 * Output:
 * 2
 * 4
 * 6
 * 8
 * 0
 * </pre>
 */
public class Program3 {
    /**
     * The main method serves as the entry point of the program.
     * It initializes an integer array and calls the {@link #getEvenElement(int[])}
     * method to print the even elements of the array.
     *
     * @param args Command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
        // Initialize an array with sample integers
        int[] array = {1, 3, 5, 7, 9, 2, 4, 6, 8, 0};

        // Call the method to print the even elements of the array
        getEvenElement(array);
    }

    /**
     * Prints the even elements of the given integer array.
     *
     * @param array The array whose even elements are to be printed
     */
    public static void getEvenElement(int[] array) {
        // Loop through each element in the array
        for (int p : array) {
            // Check if the current element is even
            if (p % 2 == 0) {
                System.out.println(p); // Print the even element
            }
        }
    }
}
