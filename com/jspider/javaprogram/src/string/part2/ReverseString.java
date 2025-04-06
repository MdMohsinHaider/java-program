package com.jspider.javaprogram.src.string.part2;

    /**
     * Write a Java Program to take a String input and reverse the String.
     */
public class ReverseString {
    public static void main(String[] args) {
        String string = "ass12kj*l";
        String reverse = revString(string);
        System.out.println(reverse);
    }

    private static String revString(String string) {
        String rev = "";
        for (int i = string.length()-1; i >=0 ; i--) {
            char c = string.charAt(i);
            rev = rev+c;
        }
        return rev;
    }
}
