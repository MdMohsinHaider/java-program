package com.jspider.javaprogram.src.string.part2;

/**
 * Write a java Program to take a String input
 * and count all the characters without spaces in the String.
 */
public class CountCharactersWithoutSpaces {
    public static void main(String[] args) {
        String string = "AS df dg apple";

        int a = countWithoutSpaces(string);
        System.out.println(a);
    }

    private static int countWithoutSpaces(String string){
        int count = 0;
        for (int i = 0; i < string.length() ; i++) {
            char c = string.charAt(i);
            if (c != ' ')
                count++;
        }
        System.out.println(string.length());
        return count;
    }
}
