package com.jspider.javaprogram.src.practices.number;

/*
*
*   Take user input and print whether the number is a perfect number or not.
*
* */

import com.jspider.lib.HelpCode;

public class Program31 {
    public static void main(String[] args) {
        HelpCode h = new HelpCode();
        System.out.println(getPerfectNumber(h.inputInt()));
    }


    private static String getPerfectNumber(int num){
        if (isPerfectNumber(num)) return num+" is perfect Number";
        else return num+" is not perfect number";
    }


    private static boolean isPerfectNumber(int num){
        return properDivisorMultiple(num) == num;
    }


    private static int properDivisorMultiple(int num){
        int divisorMultiple =1;
        for (int i = 1; i <=num/2 ; i++) {
            if (num %i ==0 ) divisorMultiple *= i;
        }
        return divisorMultiple;
    }
}
