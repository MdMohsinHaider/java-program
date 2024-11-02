package com.jspider.javaprogram.src.number;

/*
*
*          Take user input and print the Factorial of the given number.
*
*
* */

import com.jspider.lib.HelpCode;

public class Program32 {
    public static void main(String[] args) {
        HelpCode h = new HelpCode();
        System.out.println(getFactorial(h.inputLong()));
    }

    private static String getFactorial(long num){
        long tem_factorial = 1;

        for (int i = 1; i <=num ; i++) {
            tem_factorial *= i;
//            System.out.println(i+"! => "+tem_factorial);
        }
        return "The factorial of number "+num+"! is "+tem_factorial;
    }
}

