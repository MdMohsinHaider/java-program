package com.jspider.javaprogram.src.practices.recursion;

public class program1 {
    public static void main(String[] args) {
        one2Hundred(1);
    }

    public static void one2Hundred(int n){
        if (n<=100){
            System.out.println(n);
            one2Hundred(n+1);
        }
    }
}
