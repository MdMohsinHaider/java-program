package com.jspider.javaprogram.src.arrays;

/*
*   Print all the even elements array.
* */

public class Program3 {
    public static void main(String[] args) {
        int[] array = {1,3,5,7,9,2,4,6,8,0};
        getEvenElement(array);
    }

    public static void getEvenElement(int[] array){
        for (int p : array){
            if (p%2 == 0){
                System.out.println(p);
            }
        }
    }
}
