package com.jspider.javaprogram.src.practices.number;

/*
*   1^4 + 2^4 + 3^4 +__________________+100^4.
*
*
* */


public class Program17 {
    public static void main(String[] args) {
        getSum(2);
    }

    public static void getSum(int range){
        int sum=0;
        for (int i = 0; i <=range ; i++) {
            sum +=getPower(i);
        }
        System.out.println(sum);
    }

    public static int getPower(int num){
        return num*num*num*num;
    }
}
