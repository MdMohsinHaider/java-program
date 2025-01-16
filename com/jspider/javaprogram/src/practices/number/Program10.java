package com.jspider.javaprogram.src.practices.number;

/*
*
*       Take user input print and count all the factors of the number.
*
* */

import com.jspider.lib.HelpCode;

public class Program10 {
    public static void main(String[] args) {
        HelpCode in = new HelpCode();
        getFactor(in.inputInt());
    }

    public static void getFactor(int num){
        int count = 0;
        for (int i = 1; i <=num ; i++) {
            if (num%i==0){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("total numbers of occurrence : "+count);
    }
}
