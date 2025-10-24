package com.jspider.javaprogram.src.practices1.Digits;

import com.jspider.lib.HelpCode;

public class Program2 {
    public static void main(String[] args) {
        HelpCode h = new HelpCode();
        getEvenDigit(h.inputInt());
    }

    private static void getEvenDigit(int num){
        while (num != 0){
            int last_digit = num%10;
            if (HelpCode.isEven(num))
                System.out.print(last_digit+"  ");
            num/=10;
        }
    }
}
