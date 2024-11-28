package com.jspider.javaprogram.src.string.part1;

import java.util.Scanner;

public class Program11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String and Number mixed values");
        String s = scanner.nextLine();
        numericCountSum(s);
    }
    private static void numericCountSum(String s1){
        // Logic
        int count= 0;
        int sum = 0;

        for (int i = 0; i <s1.length() ; i++) {
            char ch = s1.charAt(i);
            if (ch >='0' && ch <='9'){
                count++;
                sum = sum+(ch-48);
            }
        }
        System.out.println("Count "+count);
        System.out.println("Sum "+sum);
    }
}
