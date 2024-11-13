package com.jspider.javaprogram.src.Digits;


/*
*
*   Write a java program to print all odd digits.
*
* */


import com.jspider.lib.HelpCode;

public class Program3 {
    public static void main(String[] args) {
        HelpCode h = new HelpCode();
        getOddDigits(h.inputInt());
    }

    private static void getOddDigits(int num){
        while (num != 0){
            int last_digit = num % 10;
            if (HelpCode.isOdd(num))
                System.out.print(last_digit+"  ");
            num/=10;
        }
    }
}
