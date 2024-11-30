package com.jspider.javaprogram.src.Digits;
    /*
    * Write a java Program to count number’s digits present in the number.
    * */


import com.jspider.lib.HelpCode;

public class Program5 {
    public static void main(String[] args) {
        HelpCode c = new HelpCode();
        System.out.println( getCountNumber(c.inputInt()));
    }

    private static int getCountNumber(int number){
        int count = 0;
        while (number!=0){
            count++;
            number = number/10;
        }
        return count;
    }
}
