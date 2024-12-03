package com.jspider.javaprogram.src.split_method;

import java.util.Arrays;
// line 11th
public class Program1 {
    public static void main(String[] args) {
        String s = "mo@h5a!ni123s@!$h3e#re";
        String[] p = s.split("[0-9]+");
        System.out.println(p.length);
        for (String k :p){
            System.out.println(Arrays.toString(p));
        }
    }
}
