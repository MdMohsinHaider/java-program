package com.jspider.javaprogram.src.practices1.arrays;


/*
*       Calculate and print the biggest element of an array
* */

public class Program7 {
    public static void main(String[] args) {
        int[] array = {1,3,5,7,9,2,4,6,8,0};
        System.out.println(getElement(array));
    }

    public static int getElement(int[] array){
        int big_element=array[0];
        for (int p : array){
            // Find the biggest element
            if (big_element<=p){
                big_element=p;
            }
        }
        return big_element;
    }
}
