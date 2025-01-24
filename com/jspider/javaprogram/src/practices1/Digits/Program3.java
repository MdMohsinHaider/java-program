package com.jspider.javaprogram.src.practices1.Digits;

import com.jspider.lib.HelpCode;

/**
 * This program extracts and prints all the odd digits from a given integer input.
 * It uses the {@code HelpCode} library for utility methods, including input handling
 * and determining if a number is odd.
 *
 * <p>Key functionalities:
 * <ul>
 *     <li>Take an integer input from the user using the {@code HelpCode} library.</li>
 *     <li>Iterate through each digit of the integer.</li>
 *     <li>Check if each digit is odd and print it if true.</li>
 * </ul>
 *
 * @author Md Mohsin Haider
 */
public class Program3 {

    /**
     * Main method to execute the program.
     *
     * <p>This method creates an instance of the {@code HelpCode} class to fetch user input
     * and then processes the input to extract and print odd digits.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        HelpCode h = new HelpCode();
        getOddDigits(h.inputInt());
    }

    /**
     * Extracts and prints all odd digits from the given integer.
     *
     * <p>This method uses a loop to isolate each digit of the integer by taking the modulus
     * and then checks if the digit is odd using the {@code HelpCode.isOdd} method.
     *
     * <p>If the digit is odd, it is printed to the console. The input integer is reduced by
     * dividing it by 10 in each iteration to process the next digit.
     *
     * @param num The integer whose odd digits are to be extracted and printed.
     */
    private static void getOddDigits(int num) {
        while (num != 0) {
            int last_digit = num % 10;
            if (HelpCode.isOdd(last_digit)) {
                System.out.print(last_digit + "  ");
            }
            num /= 10;
        }
    }
}