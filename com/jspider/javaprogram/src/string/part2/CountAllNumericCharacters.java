package com.jspider.javaprogram.src.string.part2;

/**
 Write a Java Program to take a String input
 and count all numeric characters in the String. */
public class CountAllNumericCharacters {
    public static void main(String[] args) {
        String string = "as12HP8 7 jh4 ";
        int a = numericCharactersCount(string);
        System.out.println(a);
    }

    private static int numericCharactersCount(String string){
        String s = string+'\0';
        int count = 0;
        for (int i = 0; i <s.indexOf('\0') ; i++) {
            char c = string.charAt(i);
            if (c >='0' && c <='9')
                count++;
        }
        return count;
    }
}
