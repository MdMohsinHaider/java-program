package com.jspider.javaprogram.src.practices.arrays;

/**
 * The Program5 class demonstrates a simple Java program that initializes an array
 * and calculates the sum of all its elements. This program showcases basic array
 * handling and arithmetic operations in Java.
 *
 * <p>Example:
 * <pre>
 * Input: {1, 3, 5, 7, 9, 2, 4, 6, 8, 0}
 * Output:
 * Sum of all elements is: 45
 * </pre>
 */
public class Program5 {
    /**
     * The main method serves as the entry point of the program.
     * It initializes an integer array and calls the {@link #getSumElement(int[])}
     * method to calculate and print the sum of the elements in the array.
     *
     * @param args Command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
        // Initialize an array with sample integers
        int[] array = {1, 3, 5, 7, 9, 2, 4, 6, 8, 0};

        // Call the method to calculate and print the sum of the array elements
        System.out.println(getSumElement(array));
    }

    /**
     * Calculates and returns the sum of the elements in the given integer array.
     *
     * @param array The array whose elements are to be summed
     * @return The sum of the elements in the array
     */
    public static int getSumElement(int[] array) {
        int sum = 0; // Initialize sum to zero
        // Loop through each element in the array and add to sum
        for (int p : array) {
            sum += p; // Add the current element to sum
        }
        return sum; // Return the total sum
    }
}
