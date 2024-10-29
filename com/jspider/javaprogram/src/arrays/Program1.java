package com.jspider.javaprogram.src.arrays;

/**
 * The Program1 class demonstrates a simple Java program that initializes an array
 * and prints its elements to the console. This program showcases basic array handling
 * and iteration in Java.
 *
 * <p>Example:
 * <pre>
 * Input: {1, 4, 6, 4, 3, 9, 1, 7, 3, 34, 3, 7}
 * Output:
 * 1
 * 4
 * 6
 * 4
 * 3
 * 9
 * 1
 * 7
 * 3
 * 34
 * 3
 * 7
 * </pre>
 */
public class Program1 {
    /**
     * The main method serves as the entry point of the program.
     * It initializes an integer array and calls the {@link #getElement(int[])}
     * method to print its elements.
     *
     * @param args Command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
        // Initialize an array with sample integers
        int[] array = {1, 4, 6, 4, 3, 9, 1, 7, 3, 34, 3, 7};

        // Call the method to print the array elements
        getElement(array);
    }

    /**
     * Prints the elements of the given integer array to the console.
     *
     * @param array The array whose elements are to be printed
     */
    public static void getElement(int[] array) {
        // Loop through each element in the array and print it
        for (int p : array) {
            System.out.println(p);
        }
    }
}
