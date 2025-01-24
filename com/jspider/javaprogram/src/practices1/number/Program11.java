package com.jspider.javaprogram.src.practices1.number;

import com.jspider.lib.HelpCode;


/*
*       Take two user input numbers and print all the prime numbers in between (number itself not included).
*
* */

public class Program11 {
    public static void main(String[] args) {
        HelpCode i = new HelpCode();
        getPrimeNumber(i.inputInt(),i.inputInt());
    }

    public static void getPrimeNumber(int range1, int range2){
        System.out.println("Prime number is : ");
        for (int i = range1; i <=range2 ; i++) {
            if (isPrimeNUmber(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean isPrimeNUmber(int num){
        if (num <= 1) return false;
        for (int i = 2; i <=Math.sqrt(num) ; i++) {
            if (num%i==0) return false;
        }
        return true;
    }
}
