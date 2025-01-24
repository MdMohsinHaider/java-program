package com.jspider.javaprogram.src.practices1.recursion;

public class program2 {

    public static void main(String[] args) {
        hundred2One(100);
    }

    public static void hundred2One(int n){
        if(n>=0){
            System.out.println(n);
            hundred2One(n-1);
        }
    }
}
