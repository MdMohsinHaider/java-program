package com.jspider.javaprogram.src.array;

public class PluOne {
    public static void main(String[] args) {
        int[] digit = {9};              // Expected Output: [1,0]
        int[] digits = {4,3,2,1};       // Expected Output: [4,3,2,2]
        int[] digits2 = {1,2,3};        // Expected Output: [1,2,4]

        printArray(plusOne(digit));
        printArray(plusOne(digits));
        printArray(plusOne(digits2));
    }

    private static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits; // Done if no carry is needed
            }
            digits[i] = 0; // Handle carry
        }

        // If all digits are 9, create a new array
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1; // Leading 1
        return newDigits;
    }

    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
