package com.jspider.javaprogram.src.Digits;


/*
*
*   Write a java program to print all digits.
*
* */


import com.jspider.lib.HelpCode;

public class Program4 {
    public static void main(String[] args) {
        HelpCode h = new HelpCode();
        getAllDigits(h.inputInt());


    }


    private static void getAllDigits(int num){
        String str = String.valueOf(num); // num convert into String.
        for (int i = 0; i < str.length() ; i++) {
            char digit  = str.charAt(i);
            System.out.print(digit+"  ");
        }
    }
}
