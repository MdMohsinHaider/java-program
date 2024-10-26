package com.jspider.javaprogram.src.arrays;

/*
* Print all the elements in a reverse order array.
* */

public class Program2 {
    public static void main(String[] args) {
        int[] array = {1,3,5,7,9,2,4,6,8,0};
        reverseArray(array);
    }

    public static void reverseArray(int[] array){
        for (int i = array.length-1; i >= 0 ; i--) {
            System.out.println(array[i]);
        }
    }
}
