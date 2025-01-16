package com.jspider.javaprogram.src.practices.number;

/*
*
*       Take user input and print a table from the user range and that number.
*
* */


import com.jspider.lib.HelpCode;

public class Program34 {
    public static void main(String[] args) {
        HelpCode h = new HelpCode();
        nTable(h.inputInt());
    }

    private static void getTable(int table){
        System.out.println(">>==================<< "+table+" >>===================<<");
        for (int i = 1; i <=10 ; i++) {
            System.out.println(table+" x "+i+"  = "+table*i);
        }
        System.out.println("-------Table of "+table+" is end ------------ \n");
    }

    private static void nTable(int range){
        for (int i = 1; i <=range ; i++) {
            getTable(i);
        }
    }
}
