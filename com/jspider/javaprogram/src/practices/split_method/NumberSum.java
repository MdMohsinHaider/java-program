package com.jspider.javaprogram.src.practices.split_method;

public class NumberSum {
    public static void main(String[] args) {
        String s = "23a34P3qR30T5";
        // first way
        String[] p = s.split("[a-zA-Z]+");
        System.out.println(p.length);
        int sum=0;
        for (String k:p){
            System.out.print(k+" ");
            sum = sum+Integer.parseInt(k);
        }
        System.out.println();
        System.out.println(sum);
    }
}
