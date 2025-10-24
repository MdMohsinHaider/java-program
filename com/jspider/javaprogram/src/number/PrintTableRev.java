package com.jspider.javaprogram.src.number;

import java.util.Scanner;

public class PrintTableRev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int input = sc.nextInt();
        printTableReverse(input);
    }

    private static void printTableReverse(int n){
        int i = 10;
        while (i>0){
            System.out.println(i*n);
            i--;
        }
    }
}
