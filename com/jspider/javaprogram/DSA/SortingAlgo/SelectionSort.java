package com.jspider.javaprogram.DSA.SortingAlgo;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {18,15,14,20,10,17,21};

        // call sorting method
        getSelectionSort(array);

        // Array print
        for (int p : array){
            System.out.println(p);
        }
    }

    public static void getSelectionSort(int[] a){
        int n = a.length;
        for (int i = 0; i < n-1; i++) {
            int min = a[i];
            int ind = i;
            for (int j = i+1; j < n; j++) {
                if (a[j]<min){
                    min=a[j];
                    ind = j;
                }
            }
            a[ind] = a[i];
            a[i] = min;
        }
    }
}
