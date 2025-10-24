package com.jspider.javaprogram.src.practices1.number;

import com.jspider.lib.HelpCode;

/*
* Take input a random number from the user and check the number is Even or Odd number and Print.
*
* */
public class Program1 {
    public static void main(String[] args) {
        // main method
        HelpCode helpCode = new HelpCode();
        checkEvenOdd(helpCode.inputInt());
    }

    // check method
    public static void checkEvenOdd(int num){
        if (HelpCode.isEven(num)){
            System.out.println("Number is even");
        } else if (HelpCode.isOdd(num)) {
            System.out.println("Number is Odd");
        }
    }
}
