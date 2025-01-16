package com.jspider.javaprogram.src.practices.number;


/*
*
*        1+2+3+__________________+100.
*
*
* */

public class Program14 {
    public static void main(String[] args) {
        // main
        int res = getSum(100,0);
        System.out.println(res);
    }

    public static int getSum(int num, int sum){
        for (int i = 0; i <=num ; i++) {
            sum=sum+i;
        }
        return sum;
    }
}
