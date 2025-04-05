package com.jspider.javaprogram.src.string.part2;

import java.util.Scanner;

/**
 * Write a Java Program to take a String input
 * and print the sum of all the numeric characters in the String.
 */
public class SumNumericCharacter {
    public static void main(String[] args) {
        System.out.println("Enter Mixed String Character");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int sum = getNumericSum(string);
        System.out.println(sum);
    }

    private static int getNumericSum(String string) {
        int sum =0;
        for (int i = 0; i <string.length() ; i++) {
            char c = string.charAt(i);
            if (c >= '0' && c <= '9'){
//                sum = sum+ Character.getNumericValue(string.charAt(i)); // pre define method
//                sum+=Character.getNumericValue(string.charAt(i));

//                sum = sum+(c -'0'); // custom method
                sum += c-'0';
            }
        }
        System.out.println(sum);
        return sum;
    }
}
