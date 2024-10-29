package com.jspider.javaprogram.src.number;

import com.jspider.lib.HelpCode;

/**
 * The Program29 class provides a method to check if a given integer is a palindrome.
 * A number is considered a palindrome if it reads the same backward as forward.
 *
 * <p>This program reads an integer input from the user, then checks and displays
 * whether it is a palindrome.
 *
 * <p>Example:
 * <pre>
 * Input: 121
 * Output: Number is palindrome 121
 *
 * Input: 123
 * Output: Number is Not palindrome
 * </pre>
 */
public class Program29 {

    /**
     * The main method serves as the entry point of the program.
     * It uses {@link HelpCode} to read the input number and calls
     * {@link #getPalindrome(int)} to determine if the number is a palindrome.
     *
     * @param args Command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
        // Create a HelpCode object for user input
        HelpCode h = new HelpCode();

        // Display the original number entered by the user
        int num = h.inputInt();
        System.out.println("Original number is " + num);

        // Call method to check and display if the number is a palindrome
        getPalindrome(num);
    }

    /**
     * Checks and prints whether the given number is a palindrome.
     * It calls the {@link #checkPalindrome(int)} method to determine the result.
     *
     * @param num The number to check for palindrome properties
     */
    public static void getPalindrome(int num) {
        if (checkPalindrome(num))
            System.out.print("Number is palindrome " + num);
        else
            System.out.print("Number is Not palindrome");
    }

    /**
     * Determines if a given number is a palindrome by comparing it to its reverse.
     *
     * @param num The number to check for palindrome properties
     * @return true if the number is a palindrome, false otherwise
     */
    public static boolean checkPalindrome(int num) {
        return num == reverseNumber(num);
    }

    /**
     * Reverses the given number and returns the reversed value.
     *
     * @param num The number to be reversed
     * @return The reversed integer
     */
    public static int reverseNumber(int num) {
        int reverse_number = 0;

        // Loop to reverse the digits of the number
        while (num != 0) {
            int digit = num % 10; // Extract the last digit

            // Append the digit in reverse order
            reverse_number = reverse_number * 10 + digit;

            // Remove the last digit from the number
            num /= 10;
        }
        return reverse_number;
    }
}
