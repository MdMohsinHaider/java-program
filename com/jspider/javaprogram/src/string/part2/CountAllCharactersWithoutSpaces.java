package com.jspider.javaprogram.src.string.part2;

/**
 * Write a Java Program to take a String input
 * and count all the characters (excluding any
 * special characters).
 */
public class CountAllCharactersWithoutSpaces {
    public static void main(String[] args) {
        String string = "ad sds & sd$ 8@# / 73Cat";
        int a = countCharactersWithoutSpaces(string);
        System.out.println(a);
    }

    private static int countCharactersWithoutSpaces(String string){
        int count = 0;
        for (int i = 0; i <string.length() ; i++) {
            char c = string.charAt(i);
            if (c >='a' && c <='z' || c >='A' && c <='Z' || c >='0' && c <='9')
                count++;
        }
        return count;
    }
}


