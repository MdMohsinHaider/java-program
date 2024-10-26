package com.jspider.javaprogram.src.SwitchCase;

import com.jspider.lib.HelpCode;

import java.util.Scanner;

public class Program2 {
    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chooses option:\n " +
                "Power          : 1\n " +
                "Factorial      : 2 \n " +
                "Prime Number   : 3 \n" +
                "Reverse Number : 5 \n");

        int opt = sc.nextInt();
        opt(opt);
    }

    // Options creations
    public static void opt(int opt_Int){
        HelpCode hl = new HelpCode();
        switch (opt_Int){
            case 1:power(hl.inputInt(),hl.inputInt());
            break;
            case 2:factorial(hl.inputInt());
            break;
            case 3:primeNumber(hl.inputInt());
            break;
            default:
                System.err.println("not valid Option !!.... ");
        }
    }

    // factorial
    public static void factorial(int num){
        System.out.println("factorial "+num);
    }

    // Power
    public static void power(int base, int pow){
        int temPower = 1;
        for (int i = 1; i <=pow ; i++) {
            temPower *=base;
        }
        System.out.println(temPower);
    }

    // Prime number
    public static void primeNumber(int num){
        System.out.println("Prime Number "+num);
    }

    // Armstrong number
    // palindrome
    // Strong Number
    // Perfect number
}
