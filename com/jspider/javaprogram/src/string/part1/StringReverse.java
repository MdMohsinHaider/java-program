package com.jspider.javaprogram.src.string.part1;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        String string = scanner.nextLine();

        String result = reverseString(string);
        System.out.println(result);
    }

    private static String reverseString(String string) {
        String s ="";
        for (int i = 0; i <string.length() ; i++) {
            char ch = string.charAt(i);
            s = ch+s;
        }
        return s;
    }
}

