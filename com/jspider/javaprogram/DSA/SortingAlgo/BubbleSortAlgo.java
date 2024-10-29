package com.jspider.javaprogram.DSA.SortingAlgo;

/**
 * The BubbleSortAlgo class provides a method to perform Bubble Sort on an integer array.
 * Bubble Sort is a simple sorting algorithm that repeatedly steps through the list,
 * compares adjacent elements, and swaps them if they are in the wrong order. The pass
 * through the list is repeated until the list is sorted.
 *
 * <p>This program demonstrates Bubble Sort on a sample array and prints the sorted elements.
 *
 * <p>Example:
 * <pre>
 * Input: {30, 40, 70, 50, 90, 100}
 * Output: 30 40 50 70 90 100
 * </pre>
 */
public class BubbleSortAlgo {

    /**
     * The main method serves as the entry point of the program.
     * It initializes two arrays and sorts one of them using the {@link #getSort(int[])} method.
     * The sorted elements are then printed to the console.
     *
     * @param args Command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
        int[] array1 = {30, 40, 70, 50, 90, 100}; // Unsorted array
        int[] array2 = {30, 40, 50, 70, 90, 100}; // Already sorted array

        getSort(array2); // Sorts array2 using Bubble Sort

        // Print sorted array elements
        for (int p : array2) {
            System.out.println(p);
        }
    }

    /**
     * Sorts the given array in ascending order using the Bubble Sort algorithm.
     * <p>During each pass, the algorithm moves the largest unsorted element
     * to its correct position at the end of the array by swapping adjacent elements.
     * If no swaps are made during a pass, the array is already sorted,
     * and the algorithm terminates early for optimization.
     *
     * @param a The array to be sorted in-place
     */
    public static void getSort(int[] a) {
        int n = a.length;

        // Outer loop for passes over the array
        for (int i = 0; i < n - 1; i++) {
            int swapCount = 0; // Tracks swaps in each pass

            // Inner loop for comparing adjacent elements
            for (int j = 0; j < n - 1 - i; j++) {
                // Swap if the current element is greater than the next
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swapCount++;
                }
            }

            // If no swaps were made, the array is already sorted
            if (swapCount == 0) break;
        }
    }
}
