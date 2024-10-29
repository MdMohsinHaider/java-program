package com.jspider.javaprogram.DSA.SortingAlgo;

/**
 * The InsertionSort class provides a method to sort an integer array using the Insertion Sort algorithm.
 * Insertion Sort picks each element from the array one by one and inserts it into its correct position,
 * gradually building a sorted portion of the array.
 *
 * <p>This program demonstrates Insertion Sort on a sample array and prints the sorted elements to the console.
 *
 * <p>Example:
 * <pre>
 * Input: {18, 15, 14, 20, 10, 17, 21}
 * Output: 10 14 15 17 18 20 21
 * </pre>
 */
public class InsertionSort {

    /**
     * The main method serves as the program's entry point.
     * It initializes an array and sorts it using {@link #getInsertionSort(int[])}.
     * The sorted elements are then printed to the console.
     *
     * @param args Command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
        int[] array = {18, 15, 14, 20, 10, 17, 21}; // Array to be sorted
        getInsertionSort(array); // Sorts the array using Insertion Sort

        // Print sorted array elements
        for (int p : array) {
            System.out.println(p);
        }
    }

    /**
     * Sorts the given array in ascending order using the Insertion Sort algorithm.
     * <p>In each pass, the algorithm picks one element from the unsorted portion of the array
     * and inserts it into the correct sorted position within the sorted portion.
     * This process gradually builds up the sorted section of the array.
     *
     * @param a The array to be sorted in place
     */
    public static void getInsertionSort(int[] a) {
        int n = a.length;

        // Loop to pick each element starting from the second position
        for (int i = 1; i < n; i++) {
            int key = a[i]; // Current element to be inserted at the correct position
            int j = i - 1;

            // Shift elements to the right to make room for the current element
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j]; // Shift element if it's greater than the current element
                j--;
            }
            a[j + 1] = key; // Insert the current element at the correct sorted position
        }
    }
}
