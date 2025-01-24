package com.jspider.javaprogram.src.practices1.number;

/*
*
*       1*2*2 + 2*2*3 + 3*2*4 + 4*2*5 + _____________+ 99*2*100.
*
*
* */


public class Program20 {
    public static void main(String[] args) {
        getCal();
    }

    public static void getCal(){
        int sum = 0;
        for (int i = 1; i <=100 ; i++) {
            sum+=i*(2*i+1);
        }
        System.out.println(sum);
    }
}
