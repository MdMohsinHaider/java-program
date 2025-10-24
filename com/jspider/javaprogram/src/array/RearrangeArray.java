package com.jspider.javaprogram.src.array;

public class RearrangeArray {
    public static void main(String[] args) {
        int[] arr = {-4, 8, 7, -6, -5, -1, 4, 3, 0, -9};
        arr = reArrangeArray(arr);

        // Printing the rearranged array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static int[] reArrangeArray(int[] arr) {
        int n = arr.length;

        // Step 1: Move negative numbers to the front (stable)
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            if (key < 0) {
                int j = i;
                while (j > 0 && arr[j - 1] >= 0) {
                    arr[j] = arr[j - 1];
                    j--;
                }
                arr[j] = key;
            }
        }

        // Step 2: Move zeros after negatives (stable)
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            if (key == 0) {
                int j = i;
                while (j > 0 && arr[j - 1] > 0) {
                    arr[j] = arr[j - 1];
                    j--;
                }
                arr[j] = key;
            }
        }

        return arr;
    }
}
