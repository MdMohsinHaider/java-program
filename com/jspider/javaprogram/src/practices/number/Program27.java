package com.jspider.javaprogram.src.practices.number;

/*
*   Take two input numbers from the user and calculate the power of the number.
*
* */

import java.util.Scanner;

/**
 * The Program27 class provides a method to calculate the power of a given base number
 * raised to a specified exponent. It uses an iterative approach to compute the result.
 *
 * <p>This program reads the base and exponent values from user input and prints the
 * result on the console.
 *
 * <p>Example:
 * <pre>
 * Input: base = 2, power = 3
 * Output: 8
 * </pre>
 */

public class Program27 {

    /**
     * The main method serves as the entry point of the program.
     * It reads user input for the base and exponent values and
     * invokes the {@link #getPower(int, int)} method to calculate the result.
     *
     * @param args Command-line arguments (not used in this program)
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner object for reading user input

        // Prompt the user to enter the base number
        System.out.print("Enter bass number : ");
        int num1 = sc.nextInt(); // Reads the base number

        // Prompt the user to enter the exponent
        System.out.print("Enter power : ");
        int num2 = sc.nextInt();// Reads the exponent

        // Calls the method to calculate and print the power
        getPower(num1,num2);
    }


    /**
     * Calculates the power of a given base raised to a specified exponent using an iterative approach.
     * <p>The method initializes the result as 1 and multiplies it by the base for each iteration.
     * The result is then printed on the console.
     *
     * @param base The base number to be raised.
     * @param pow The exponent to which the base is raised.
     */

    public static void getPower(int base, int pow){
        int power = 1; // Initialize power to 1, which is the multiplicative identity

        // Loop to multiply base 'pow' times
        for (int i = 1; i <= pow; i++) {
            power = power * base; // Multiply the current power by the base
        }

        System.out.println(power); // Print the calculated power
    }
}
