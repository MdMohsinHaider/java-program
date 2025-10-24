package com.jspider.javaprogram.src.pattern.Solid;

public class Square {

    public static void main(String[] args) {
        int n = 15;
        getSquare(n);
    }

    private static void getSquare(int n){

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-1; j++) {
                System.out.print("*  ");
            }
            System.out.println("* ");
        }
    }
}
