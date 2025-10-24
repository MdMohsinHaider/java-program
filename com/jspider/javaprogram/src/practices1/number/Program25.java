package com.jspider.javaprogram.src.practices1.number;

/*
*
*       1/1*2 + 1/2*3 + 1/3*4 + ___________+ 1/99*100.
*
*
* */

public class Program25 {
    public static void main(String[] args) {
        getCal();
    }
    public static void getCal(){
        int sum = 0;
        for (int i = 1; i <=100 ; i++) {
            sum+=1/(i*(i+1));
        }
        System.out.println(sum);
    }
}
