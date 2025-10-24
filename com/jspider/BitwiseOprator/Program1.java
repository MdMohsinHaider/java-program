package com.jspider.BitwiseOprator;

public class Program1 {
    public static void main(String[] args) {
//        System.out.println(40|| 28); ✕
        /**
         * bitwise or takes two binary numbers
         */
        System.out.println("40 | 28 = "+(40 | 28));
        System.out.println("40 & 28 = "+(40&28));
        System.out.println("40^28 = "+(40^28));
        System.out.println("~40 = "+(~40));
        System.out.println("40<<2 = "+(40<<2));
        System.out.println("40>>2 = "+(40>>2));
        System.out.println("40>>>2 = "+(40>>>2));

        System.out.println("\n--------solve it--------------\n");

        System.out.println("100 | 58 = "+(100 | 58));
        System.out.println("110 | 75 = "+(100 | 58));
        System.out.println("50 | -12 = "+(100 | 58));
        System.out.println("-50 | -100 = "+(100 | 58));
    }
}
