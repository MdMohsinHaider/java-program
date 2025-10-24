package com.jspider.javaprogram.src.practices1.number;

/*
*
*       1^2+2^2+3^2+----------------+100^2.
 *
* */


public class Program15 {
    public static void main(String[] args) {
        getSum(100);
    }

    public static void getSum(int range){
        int num=0;
        for (int i = 0; i <=range ; i++) {
            num = num+getPower(i);
        }
        System.out.println(num);
    }

    public static int getPower(int num){
        return num*num;
    }
}
