package com.jspider.javaprogram.src.practices.number;

/*
*
*       1/1^2 + 1/2^2 + 1/3^2 + 1/4^2 + ___________+1/100^2.
*
*
* */


public class Program22 {
    public static void main(String[] args) {
        getCal();
    }

    public static void getCal(){
        int sum= 0;
        for (int i = 1; i <100 ; i++) {
            sum+=1/(i*i);
        }
        System.out.println(sum);
    }
}
