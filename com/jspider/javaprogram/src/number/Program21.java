package com.jspider.javaprogram.src.number;

/*
*
*           1/1 + ½ + ⅓ + ¼ + ___________+1/100.
*
* */


public class Program21 {
    public static void main(String[] args) {
        getCal();
    }

    public static void getCal(){
        int sum=0;
        for (int i = 1; i <=100 ; i++) {
            sum+=1/i;
        }
        System.out.println(sum);
    }
}
