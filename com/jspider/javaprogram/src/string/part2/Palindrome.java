package com.jspider.javaprogram.src.string.part2;

public class Palindrome {
    public static void main(String[] args) {
        String string = "aa787aa";
        if (isPalindrome(string)) System.out.println("It is Palindrome");
        else System.out.println("It is not Palindrome");
    }

    private static boolean isPalindrome(String string) {
        return string.equals(revString(string));
    }

    private static String revString(String string) {
        String revString = "";
        for (int i = string.length()-1; i >=0 ; i--) {
            char c = string.charAt(i);
            revString += c;
        }

        System.out.println("rev String: "+revString);
        return revString;
    }
}
