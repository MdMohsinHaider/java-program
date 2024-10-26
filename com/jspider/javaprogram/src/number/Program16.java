package com.jspider.javaprogram.src.number;

/*
*
*       1^3+2^3+3^3+4^3+__________________+100^3.
*
* */

public class Program16 {
    public static void main(String[] args) {
        getSum(100);
    }

    public static void getSum(int range){
        int sum = 0;
        for (int i = 0; i <=range ; i++) {
            sum= sum+getPower(i);
        }
        System.out.println(sum);
    }

    public static int getPower(int num){
        return num*num*num;
    }
}
