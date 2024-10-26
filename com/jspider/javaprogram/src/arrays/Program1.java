package com.jspider.javaprogram.src.arrays;

public class Program1 {
    public static void main(String[] args) {
        // main method
        int[] array = {1,4,6,4,3,9,1,7,3,34,3,7};
        getElement(array);
    }

    public static void getElement(int[] array){
        // print elements
        for (int p : array){
            System.out.println(p);
        }
    }
}
