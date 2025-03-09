package com.jspider.javaprogram.src.string.part1;

import java.util.Scanner;

public class IsStringPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String");
        String string = scanner.nextLine();

        String result = isStringPalindrome(string);
        System.out.println(result);
    }

    private static String isStringPalindrome(String string) {
        if (string.equals(reverse(string)))
            return "String is Palindrome";
        else return "String is Not Palindrome";
    }

    private static String reverse(String string){
        String reverse = "";
        for (int i = 0; i <string.length() ; i++) {
            char ch = string.charAt(i);
            reverse = ch + reverse;
        }
        return reverse;
    }
}
