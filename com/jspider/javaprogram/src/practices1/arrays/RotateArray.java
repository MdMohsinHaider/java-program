package com.jspider.javaprogram.src.practices1.arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] array = {1,3,5,7,9,2,4,6,8,0};
        rotateArray(array);
    }

    public static void rotateArray(int[] array){
        int temp = array[array.length-1];
        for (int i = array.length-2; i >=0 ; i--) {
            array[i+1] = array[i];

        }
        array[0] = temp;
        for (int p : array){
            System.out.print(p +" ");
        }
    }

    // Array left rotation
    public static void rotateLeft(int[] array){
        int temp = array[0];
        for (int i = 1; i <array.length ; i++) {
            array[i+1] = array[i];
        }
        array[array.length-1] = temp;
    }
}
