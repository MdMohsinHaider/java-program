package com.jspider.javaprogram.src.string.part2;

/**
 * Write a Java Program to check if a string contains only digits.
 */
public class CheckStringContainsOnlyDigits {
    public static void main(String[] args) {
        String string = "mohsin  haider 12 devil 98";
        System.out.println(isContainsOnlyDigits(string)); // false
    }

    private static boolean isContainsOnlyDigits(String string){
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (!(c>='0' && c<='9'))
                return false;
        }
        return true;
    }
}
