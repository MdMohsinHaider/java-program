package com.jspider.javaprogram.src.practices.number;

/*
*
*       Take user input print factorial of number.
*
*
* */


import java.util.Scanner;

public class Program26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial : ");
        int in = sc.nextInt();
        getFactorial(in);
    }

    public static void getFactorial(int num){
        int fact = 1;
        for (int i = num; i >= 1 ; i--) {
            fact*=i;
        }
        System.out.println(fact);
    }
}
