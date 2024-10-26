package com.jspider.javaprogram.src.number;


/*
*   Take the user input number and check if the number is prime or not.
*
* */

import com.jspider.lib.HelpCode;

public class Program12 {
    public static void main(String[] args) {
        HelpCode i = new HelpCode();
        if (isPrimeNumber(i.inputInt())){
            System.out.println("Number is a prime number");
        }
        else {
            System.out.println("number is Not a Prime number");
        }
    }

    public static boolean isPrimeNumber(int num){
        if (num<=1) return false;
        for (int i = 2; i <=Math.sqrt(num) ; i++) {
            if (num%i == 0) return false;
        }
        return true;
    }
}
