package com.jspider.javaprogram.src.practices1.number;

import com.jspider.lib.HelpCode;

/**
 * Take user input and generate many terms in the fibonacci series.
 *
 *
 *    The Program28 class provides functionality to display the Fibonacci sequence
 *    up to a specified number of terms. The sequence is calculated iteratively
 *    and displayed on the console.
 *
 *    <p>This program uses the {@link HelpCode} class to take user input for the
 *    number of terms in the sequence. The Fibonacci sequence starts with 0 and 1,
 *    and each later term is the sum of the two preceding ones.
 *
 *    <p>Example:
 *    <pre>
 *    Input: 5
 *    Output: 0 1 1 2 3
 *    <pre/>
 */

public class Program28 {

    /**
     * The main method that serves as the entry point of the program.
     * This method creates an instance of {@link HelpCode} to read user input,
     * then calls {@link #getFibonacci(int)} to calculate and display the Fibonacci sequence.
     *
     * @param args Command-line arguments (not used in this program)
     */


    public static void main(String[] args) {
        HelpCode h = new HelpCode(); // Instance of HelpCode to capture user input.
        getFibonacci(h.inputInt()); // Calls the method with the user's input value.
    }

    /**
     * Calculates and displays the Fibonacci sequence up to the specified number of terms.
     * <p>The first two terms are initialized to 0 and 1, and each later term is the sum
     * of the previous two terms. The sequence is printed on a single line.
     *
     * @param num The number of terms to generate in the Fibonacci sequence.
     *            If num is less than or equal to 0, no output will be displayed.
     */

    public static void getFibonacci(int num){
        int n1 = 0; // Initial term of the sequence
        int n2 = 1; // Second term of the sequence

        // Prints the first two terms of the Fibonacci sequence.
        System.out.print(n1 + " " + n2 + " ");

        // Iteratively calculates and prints the latter terms
        for (int i = 1; i <=num-2 ; i++) {
            int n3 = n1+n2; // Calculate the next term in the sequence
            System.out.print(n3+" ");
            n1 = n2; // Update n1 to the next term
            n2 = n3; // Update n2 to the new term
        }
    }
}
