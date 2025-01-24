package com.jspider.javaprogram.src.practices1.pattern;

import com.jspider.lib.HelpCode;
//
//        * * * * *
//        *       *
//        *       *
//        *       *
//        * * * * *
//

public class Pattern1 {
    public static void main(String[] args) {
        // main method
        HelpCode in = new HelpCode();
        hollowSquare(in.inputInt());
    }

    public static void hollowSquare(int n){
        if (n%2 == 0){
            System.err.println("Please Enter Odd number");
            return;
        }
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                if (i==1 || i==n || j==1 || j==n) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }

}
