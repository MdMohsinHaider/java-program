package com.jspider.javaprogram.src.practices1.number;

import com.jspider.lib.HelpCode;

/**
 * Program30 calculates and prints the factors of a given number if the number is a palindrome.
 */

public class Program30 {

    /**
     * Main method to execute the program. Takes user input through the HelpCode class and
     * calculates factors if the number is a palindrome.
     *
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args) {
        HelpCode h = new HelpCode(); // Create an instance of HelpCode for user input
        getFactorial(h.inputInt());  // Get integer input and call getFactorial to print factors
    }

    /**
     * Prints all factors of the specified number if it meets the palindrome condition.
     * If not, displays a message indicating the number is not eligible.
     *
     * @param num The integer to calculate and print factors for, if it's a palindrome
     */
    private static void getFactorial(int num) {
        if (isEligibleForFactorial(num)) { // Check if the number is a palindrome
            // Loop to print factors by iterating up to half the number
            for (int i = 1; i <= num / 2; i++) {
                if (num % i == 0) { // Check if `i` a factor of num
                    System.out.print(i +" ");
                }
            }
            System.out.print(num); // Print the number itself as its last factor
        } else {
            System.out.println("Number not eligible"); // If not a palindrome, print ineligibility
        }
    }


    /**
     * Determines eligibility for factor calculation by checking if the number is a palindrome.
     *
     * @param num The integer to check
     * @return true if the number is a palindrome, otherwise, false
     */
    private static boolean isEligibleForFactorial(int num) {
        return checkPalindrome(num); // Calls checkPalindrome to verify
    }


    /**
     * Checks if a given number is a palindrome.
     *
     * @param num The integer to verify
     * @return true if the number reads the same backward as forward; otherwise, false
     */
    private static boolean checkPalindrome(int num) {
        return reverseNumber(num) == num; // Compares the number with its reversed value
    }


    /**
     * Reverses the digits of the specified integer and returns the reversed number.
     *
     * @param num The integer to reverse
     * @return The reversed integer
     */
    private static int reverseNumber(int num) {
        int reverse = 0;

        // Loop to reverse the digits of the number
        while (num != 0) {
            int last_digit = num % 10;             // Extract the last digit
            reverse = reverse * 10 + last_digit;   // Append last digit to reversed number
            num /= 10;                             // Remove last digit from original number
        }

        return reverse; // Return the reversed number
    }
}
