package com.jspider.javaprogram.DSA.SortingAlgo;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {18,15,14,20,10,17,21};
        getInsertionSort(array);

        // print
        for (int p : array){
            System.out.println(p);
        }
    }

    public static void getInsertionSort(int[] a){
        int n = a.length;
        for (int i = 1; i <n ; i++) {
            int key = a[i];
            int j = i-1;
            while (j >= 0 && a[j]> key){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = key;
        }
    }
}
