package com.jspider.javaprogram.src.practices1.number;


/*
*           Write a Java Program to print all the numbers up to 1000 which ends with 8 and divided by 8.
*
* */


public class Program7 {
    public static void main(String[] args) {
        getValue();
    }

    public static void getValue(){
        for (int i = 0; i <=1000 ; i++) {
            if (i%10 ==8 && i%8==0){
                System.out.println(i);
            }
        }
    }
}
