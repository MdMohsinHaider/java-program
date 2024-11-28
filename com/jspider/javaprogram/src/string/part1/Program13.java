package com.jspider.javaprogram.src.string.part1;

import java.util.Scanner;

public class Program13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String");
        String s = scanner.nextLine();
        System.out.println(s);
        reverseString1(s);
        reverseString2(s);
    }

    // 1st way
    private  static void reverseString1(String s1){
        String revers = "";
        for (int i = 0; i <s1.length() ; i++) {
            char ch = s1.charAt(i);
            revers = ch + revers;
        }
        System.out.println(revers);
    }


    private  static void reverseString2(String s1){
        String revers = "";
        for (int i = s1.length()-1; i >=0; i--) {
            char ch = s1.charAt(i);
            revers = revers+ch;
        }
        System.out.println(revers);
    }
}
