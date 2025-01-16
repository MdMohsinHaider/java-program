package com.jspider.javaprogram.src.practices.split_method;
// line 12th
public class Program2 {
    public static void main(String[] args) {
        String s = "23a34P3qR30T5";
        // first way
        String[] p = s.split("[a-zA-Z]+");
        System.out.println(p.length);
        for (String k:p){
            System.out.print(k+" ");
        }
    }
}
