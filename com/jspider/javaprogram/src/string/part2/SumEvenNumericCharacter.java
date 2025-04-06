package com.jspider.javaprogram.src.string.part2;

/**
 * Write a Java Program to take a String input and print sum of
 * all the even numeric characters in the String.
 */

public class SumEvenNumericCharacter {
    public static void main(String[] args) {
        String string = "1f0dv3am6nj3j4j72b7";
        int i = getSumOfEvenChar(string);
        System.out.println("return value : "+i);
    }

    private static int getSumOfEvenChar(String string) {
        int sum = 0;
        for (int i = 0; i <string.length() ; i++) {
            char charAt = string.charAt(i);
            if (charAt >='0' && charAt <= '9' && charAt%2 == 0)
                sum+=charAt-'0';
        }
        return sum;
    }
}
