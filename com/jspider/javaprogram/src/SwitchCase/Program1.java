package com.jspider.javaprogram.src.SwitchCase;

import com.jspider.lib.HelpCode;

import java.util.Scanner;

/**
 * The Program1 class demonstrates a simple Java calculator program that performs
 * basic arithmetic operations (addition, subtraction, multiplication, division, and modulus)
 * based on user input.
 * It uses a switch-case statement to determine the operation
 * to perform.
 *
 * <p>Example:
 * <pre>
 * Input: Enter + - * / % : +
 *        First number: 5
 *        Second number: 3
 * Output: 8
 * </pre>
 */
public class Program1 {
    /**
     * The main method serves as the entry point of the program.
     * It prompts the user to enter an arithmetic operator and two integers,
     * then calls the {@link #cal(int, char, int)} method to perform the calculation.
     *
     * @param args Command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Create a HelpCode object to assist with input operations
        HelpCode h = new HelpCode();

        // Prompt the user to enter an arithmetic operator
        System.out.print("Enter + - * / % : ");
        char ch = sc.next().charAt(0); // Read the operator input

        // Call the calculation method with two integers and the operator
        cal(h.inputInt(), ch, h.inputInt());
    }

    /**
     * Performs the arithmetic operation based on the specified operator.
     *
     * @param first_number The first operand
     * @param option_operator The operator indicating the operation to perform
     * @param second_number The second operand
     */
    public static void cal(int first_number, char option_operator, int second_number) {
        // Use a switch-case statement to perform the appropriate operation
        switch (option_operator) {
            case '+':
                // Addition operation
                System.out.println(first_number + second_number);
                break;
            case '-':
                // Subtraction operation
                System.out.println(first_number - second_number);
                break;
            case '*':
                // Multiplication operation
                System.out.println(first_number * second_number);
                break;
            case '/':
                // Division operation (considering potential division by zero)
                if (second_number != 0) {
                    System.out.println(first_number / second_number);
                } else {
                    System.out.println("Error: Division by zero is undefined.");
                }
                break;
            case '%':
                // Modulus operation
                if (second_number != 0) {
                    System.out.println(first_number % second_number);
                } else {
                    System.out.println("Error: Division by zero is undefined.");
                }
                break;
            default:
                // Handle invalid operator input
                System.out.println("Wrong input");
        }
    }
}
