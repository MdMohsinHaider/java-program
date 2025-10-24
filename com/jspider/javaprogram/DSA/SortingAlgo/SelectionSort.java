package com.jspider.javaprogram.DSA.SortingAlgo;

/**
 * The SelectionSort class provides a method to sort an integer array using the Selection Sort algorithm.
 * Selection Sort repeatedly selects the smallest (or largest, depending on sorting order) element
 * from the unsorted portion of the array and swaps it with the first unsorted element, thereby
 * growing the sorted portion of the array.
 *
 * <p>This program demonstrates Selection Sort on a sample array and prints the sorted elements to the console.
 *
 * <p>Example:
 * <pre>
 * Input: {18, 15, 14, 20, 10, 17, 21}
 * Output: 10 14 15 17 18 20 21
 * </pre>
 */
public class SelectionSort {

    /**
     * The main method serves as the program's entry point.
     * It initializes an array and sorts it using {@link #getSelectionSort(int[])}.
     * The sorted elements are then printed to the console.
     *
     * @param args Command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
        int[] array = {18, 15, 14, 20, 10, 17, 21}; // Array to be sorted

        // Call the sorting method
        getSelectionSort(array);

        // Print the sorted array elements
        for (int p : array) {
            System.out.println(p);
        }
    }

    /**
     * Sorts the given array in ascending order using the Selection Sort algorithm.
     * <p>The algorithm divides the array into a sorted and an unsorted part.
     * It repeatedly selects the smallest element from the unsorted part and moves it
     * to the end of the sorted part until the entire array is sorted.
     *
     * @param a The array to be sorted in place
     */
    public static void getSelectionSort(int[] a) {
        int n = a.length;

        // Loop through each element in the array except the last one
        for (int i = 0; i < n - 1; i++) {
            int min = a[i]; // Assume the first unsorted element is the minimum
            int ind = i; // Index of the minimum element

            // Find the minimum element in the unsorted portion of the array
            for (int j = i + 1; j < n; j++) {
                if (a[j] < min) {
                    min = a[j]; // Update minimum if a smaller element is found
                    ind = j; // Update index of the new minimum element
                }
            }

            // Swap the found minimum element with the first unsorted element
            a[ind] = a[i];
            a[i] = min;
        }
    }
}
