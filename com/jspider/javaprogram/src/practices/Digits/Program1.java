package com.jspider.javaprogram.src.practices.Digits;


/*
*
*   Write a java program to print each digit of number one by one.
*   0 to 9
*
* */


import com.jspider.lib.HelpCode;

public class Program1 {
    public static void main(String[] args) {
        HelpCode h = new HelpCode();
        getDigit(h.inputInt());
    }

    private static void getDigit(int num){
        int temp_num = 0; // store Reverse order number
        while (num > 0){
            int last_digit = num % 10;
            temp_num = temp_num*10+last_digit;
            num/=10;
        }

        // Reverse order into forward order.
        while (temp_num > 0){
            int last_digit = temp_num % 10;
            System.out.print(last_digit+"  ");
            temp_num/=10;
        }
    }
}
