package com.jspider.javaprogram.src.arrays;

/**
 * The Program02 class demonstrates a Java program that counts and prints the frequency
 * of each unique element in an integer array. The program modifies the original array
 * to avoid counting duplicates during the frequency calculation.
 *
 * <p>Example:
 * <pre>
 * Input: {12, 8, 5, 12, 5, 12, 10, 12, 12}
 * Output:
 * 12 is : 5 times
 * 8 is : 1 times
 * 5 is : 2 times
 * 10 is : 1 times
 * </pre>
 */
public class Program02 {
    /**
     * The main method serves as the entry point of the program.
     * It initializes an integer array and calls the {@link #printFrequency(int[])}
     * method to count and print the frequency of each unique element.
     *
     * @param args Command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
        // Initialize an array with sample integers
        int[] a = {12, 8, 5, 12, 5, 12, 10, 12, 12};

        // Call the method to print the frequency of each unique element
        printFrequency(a);
    }

    /**
     * Prints the frequency of each unique element in the given integer array.
     * <p>The method modifies the array to keep track of already counted elements
     * by replacing duplicates with the last element of the array and reducing
     * the size of the array being considered.
     *
     * @param a The array whose element frequencies are to be printed
     */
    public static void printFrequency(int[] a) {
        int n = a.length; // Get the initial length of the array

        // Loop through each element in the array
        for (int i = 0; i < n; i++) {
            int count = 1; // Initialize count for the current element

            // Inner loop to count duplicates of the current element
            for (int j = i + 1; j < n; j++) {
                // If a duplicate is found
                if (a[i] == a[j]) {
                    count++; // Increment count
                    a[j] = a[n - 1]; // Replace duplicate with the last element
                    n--; // Reduce the size of the array
                    j--; // Adjust the index to check the new element
                }
            }
            // Print the frequency of the current element
            System.out.println(a[i] + " is : " + count + " times");
        }
    }
}
