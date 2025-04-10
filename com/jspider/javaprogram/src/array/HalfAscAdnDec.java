package com.jspider.javaprogram.src.array;

import java.util.Arrays;

public class HalfAscAdnDec {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int mid = array.length/2;

        int[] result = getHalfAscAndDec(array,mid);
        System.out.println(Arrays.toString(result));

    }

    private static int[] getHalfAscAndDec(int[] array, int mid){

        // first part
        for (int i = 0; i <= mid-1 ; i++) {
            for (int j = i+1 ; j <=mid-1 ; j++) {
                if (array[i]>array[j]){
                    int temp =array[i];
                    array[i] =array[j];
                    array[j] = temp;
                }
            }
        }

        // second part
        for ( int i = mid; i < array.length ; i++) {
            for (int j = i+1; j <array.length ; j++) {
                if (array[i]<array[j]){
                    int temp =array[i];
                    array[i] =array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}

