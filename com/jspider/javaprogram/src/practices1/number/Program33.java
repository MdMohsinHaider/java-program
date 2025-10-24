package com.jspider.javaprogram.src.practices1.number;


/*
*
*  Take user input and print a table with that user n number.
*   2 * 1 = 2
*
* */


import com.jspider.lib.HelpCode;

public class Program33 {
    public static void main(String[] args) {
        HelpCode h = new HelpCode();
        getTable(h.inputInt());
    }

    private static void getTable(int table){
        System.out.println(">>==================<< "+table+" >>===================<<");
        for (int i = 1; i <=10 ; i++) {
            System.out.println(table+" x "+i+" = "+table*i);
        }
        System.out.println("-------Table of "+table+" is end ------------ \n");
    }

}
