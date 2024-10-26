package com.jspider.javaprogram.src.number;

/*
*       Write a Java Program to print all the numbers in between 1000 and 2000 and
*       number ends with 7 and divided by 7 and
*       also print numbers of counts occurrence.
* */

public class Program8 {
    public static void main(String[] args) {
        getPrint(1000,2000);
    }


    public static void getPrint(int num1, int num2){
        int count=0;
        for (int i = num1; i <=num2 ; i++) {
            if (i%10==7 && i%7==0){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("total number of occurrence is : "+count);
    }
}
