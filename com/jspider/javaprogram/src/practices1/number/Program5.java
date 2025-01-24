package com.jspider.javaprogram.src.practices1.number;
/*
*           Write a java Program to print all the even numbers up to 100.
* */
public class Program5 {
    public static void main(String[] args) {
        getEven(100);
    }

    public static void getEven(int num){
        for (int i = 0; i <=num ; i++) {
            if (checkEven(i)) System.out.println(i);
        }
    }

    public static boolean checkEven(int num){
        return num % 2 == 0;
    }
}
