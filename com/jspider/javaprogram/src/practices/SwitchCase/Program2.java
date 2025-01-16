package com.jspider.javaprogram.src.practices.SwitchCase;

import com.jspider.lib.HelpCode;

import java.util.Scanner;

/**
 * The Program2 class provides a console-based application that allows users to perform
 * various mathematical operations including power calculation, factorial computation,
 * and prime number verification.
 * The operations are selected through a simple menu.
 *
 * <p>Example:
 * <pre>
 * Input: 1 (for power), base: 2, exponent: 3
 * Output: 8
 * </pre>
 */
public class Program2 {
    // The Main method serves as the entry point for the program
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Display the available options to the user
        System.out.println("Choose an option:\n " +
                "Power          : 1\n " +
                "Factorial      : 2 \n " +
                "Prime Number   : 3 \n" +
                "Reverse Number : 5 \n");

        // Read the user's option input
        int opt = sc.nextInt();

        // Call the method to execute the selected operation
        opt(opt);
    }

    /**
     * Executes the operation based on the user's selected option.
     *
     * @param opt_Int The option selected by the user
     */
    public static void opt(int opt_Int) {
        HelpCode hl = new HelpCode(); // Create a HelpCode object to assist with input operations

        // Use a switch-case statement to determine the selected operation
        switch (opt_Int) {
            case 1:
                // Calculate the power of a number
                power(hl.inputInt(), hl.inputInt());
                break;
            case 2:
                // Calculate factorial of a number
                factorial(hl.inputInt());
                break;
            case 3:
                // Check if a number is prime
                primeNumber(hl.inputInt());
                break;
            default:
                // Handle invalid option input
                System.err.println("Not a valid option !!.... ");
        }
    }

    /**
     * Calculates and prints the factorial of the given number.
     *
     * @param num The number to calculate the factorial for
     */
    public static void factorial(int num) {
        System.out.println("Factorial of " + num);
        // Factorial calculation logic can be implemented here
    }

    /**
     * Calculates and prints the result of raising a base to a specified power.
     *
     * @param base The base number
     * @param pow The exponent to raise the base to
     */
    public static void power(int base, int pow) {
        int temPower = 1; // Initialize result to 1
        // Calculate power using a loop
        for (int i = 1; i <= pow; i++) {
            temPower *= base; // Multiply base by itself for pow times
        }
        // Print the result
        System.out.println(base + " raised to the power of " + pow + " is: " + temPower);
    }

    /**
     * Checks if the given number is a prime number and prints the result.
     *
     * @param num The number to check for primality
     */
    public static void primeNumber(int num) {
        System.out.println("Prime Number: " + num);
        // Prime number check logic can be implemented here
    }

    // Additional methods for Armstrong number, palindrome, strong number, and perfect number
    // can be added here as needed.
}
