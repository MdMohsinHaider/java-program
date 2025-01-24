package com.jspider.javaprogram.src.practices1.number;

import com.jspider.lib.HelpCode;

public class Program3 {
    public static void main(String[] args) {
        HelpCode helpCode = new HelpCode();
        lastSecondDigit(helpCode.inputInt());
    }

    public static void lastSecondDigit(int num){
        num/=10;
        System.out.print("last 2nd digit is : "+num%10);
    }
}
