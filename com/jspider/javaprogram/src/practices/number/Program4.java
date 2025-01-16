package com.jspider.javaprogram.src.practices.number;

import com.jspider.lib.HelpCode;
/*
*
* Take Input a Random Number from the user and print the first three-digit number
*
* */
public class Program4 {
    public static void main(String[] args) {
        // main method
        HelpCode helpCode = new HelpCode();
        System.out.println( firstThreeDigit(helpCode.inputInt()));
    }

    public static String firstThreeDigit(int num){
        String temp ="";
        while (num>100){
            temp=""+num;
            num/=10; 
        }
        return temp;
     }
}
