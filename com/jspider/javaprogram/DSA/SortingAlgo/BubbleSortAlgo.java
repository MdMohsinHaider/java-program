package com.jspider.javaprogram.DSA.SortingAlgo;

/**
 * The BubbleSortAlgo class provides a method to perform Bubble Sort on an integer array.
 * Bubble Sort is a simple sorting algorithm that repeatedly steps through the list,
 * compares adjacent elements, and swaps them if they are in the wrong order. The pass
 * through the list is repeated until the list is sorted.
 *
 * <p>This program demonstrates Bubble Sort on a sample array and prints the sorted elements.
 * <p> time : O(n^2)
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
     * If no swaps are made during array pass, the array is already sorted,
     * and the algorithm terminates early for optimization.
     *
     * @param array The array to be sorted in-place
     */
    public static void getSort(int[] array) {
        // Outer loop for passes over the array
        for (int i = 0; i < array.length - 1; i++) {
            int swapCount = 0; // Tracks swaps in each pass

            // Inner loop for comparing adjacent elements
            for (int j = 0; j < array.length -1 -i; j++) {
                // Swap if the current element is greater than the next
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    // increment swap Count by 1
                    swapCount++;
                }
            }

            // If no swaps were made, the array is already sorted
            if (swapCount == 0) break;
        }
    }
}

