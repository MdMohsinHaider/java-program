package com.jspider.javaprogram.src.practices.string.part1;

import java.util.Scanner;

public class Program14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String");
        String s = scanner.nextLine();
        getPalindrome(s);
    }

    private static void getPalindrome(String s){
        if (isPalindrome(s)){
            System.out.println("String is palindrome : "+ s);
        }
        else System.out.println("String is not palindrome : "+s);
    }

    // Revers the string
    private  static boolean isPalindrome(String s1){
        s1 = s1.toLowerCase();
        String revers = "";
        for (int i = 0; i <s1.length()/2 ; i++) {
            char ch = s1.charAt(i);
            if (ch != s1.charAt(s1.length()-1-i)){
                return false;
            }
        }
        System.out.println(revers);
        return true;
    }
}
