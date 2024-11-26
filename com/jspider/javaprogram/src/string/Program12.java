package com.jspider.javaprogram.src.string;

import java.util.Scanner;

public class Program12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Words ");
        String s = scanner.nextLine();
        countWord(s);
    }

    private static void countWord(String s1){
        int count = 0 ;
        for (int i = 0; i < s1.length() ; i++) {
            char ch = s1.charAt(i);
            if (i==0 && ch !=' '|| ch != ' ' && s1.charAt(i-1) == ' '){
                count++;
            }
        }
        System.out.println("Total Word in String : "+count);
    }
}
