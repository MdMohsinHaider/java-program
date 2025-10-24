package com.jspider.javaprogram.src.practices2;

import java.util.Arrays;

public class HalfAscAdnDec {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,9,10};
        int mid = arr.length/2;
        int[] arrOutput = halfAcHalfDec(arr,mid);
        System.out.println(Arrays.toString(arrOutput));
    }
    private static int[]halfAcHalfDec(int[] arr, int mid){

        // first part
        for (int i = 0; i <mid-1 ; i++) {
            for (int j = i+1; j <mid-1 ; j++) {
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        // second part
        for (int i = mid; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

}
