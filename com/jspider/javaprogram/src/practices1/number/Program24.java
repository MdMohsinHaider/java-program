package com.jspider.javaprogram.src.practices1.number;


/*
*
*       1/1 - ½ - ⅓ - ¼ - ___________-1/100.
*
*
* */

public class Program24 {
    public static void main(String[] args) {
        getCal();
    }

    public static void getCal(){
        int sub =0;
        for (int i = 1; i < 100 ; i++) {
            sub-=(1/i);
        }
        System.out.println(sub);
    }
}
