package com.jspider.javaprogram.src.practices.number;

/*
*
*           Write a java Program to print all the numbers with user input range between and ends with 7.
*
* */

import com.jspider.lib.HelpCode;

public class Program6 {
    public static void main(String[] args) {
        HelpCode in = new HelpCode();
        getNumber(in.inputInt(),in.inputInt());
    }

    public static void getNumber(int num1, int num2){
        for (int i = num1; i <=num2 ; i++) {
            if (i%10 == 7){
                System.out.println(i);
            }
        }
    }
}
