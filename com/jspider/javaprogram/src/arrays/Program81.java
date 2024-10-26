package com.jspider.javaprogram.src.arrays;

public class Program81 {
    public static void main(String[] args) {
        int[] array = {7,0,2,6,0,4};
        shiftZero(array);
    }

    public static void shiftZero(int[] array){
        for (int i = 0,j=0; i <array.length ; i++) {
            if (array[i] != 0){
                array[j] = array[i];
                j++;
                if (i!=j){
                    array[i] = 0;
                }
            }
        }

        for (int p : array){
            System.out.print(p+" ");
        }
    }
}
