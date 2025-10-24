package com.jspider.javaprogram.DSA.SortingAlgo;

public class MergeSortAlgorithm {
    public static void main(String[] args) {
        int[] array ={12,65,87,45,12,65,98,67,56,98,45,90,45,56,87};
        for (int p :array){
            System.out.print(" "+p);
        }
        System.out.println("\n");
        divide(array,0,array.length-1);

        for (int p :array){
            System.out.print(" "+p);
        }
    }

    private static void divide(int[] a, int si, int ei){
        // divide
        if (si < ei){
            int mid = si+(ei-si)/2;
            divide(a,si,mid);
            divide(a,mid+1,ei);

            // Call merge method
            merge(a,si,mid,ei);
        }
    }

    public static void merge(int[]a, int si, int mid, int ei){
        // merge
        int[] merged = new int[ei-si+1];
        int index1 = si; // as use a pointer.
        int index2 = mid+1; // as use a pointer.
        int x = 0; // as use a pointer.

        while (index1 <= mid && index2 <= ei){
            if (a[index1] < a[index2])
                merged[x++] = a[index1++];
            else merged[x++] = a[index2++];
        }

        while (index1 <= mid){
            merged[x++] = a[index1++];
        }

        while (index2<=ei){
            merged[x++] = a[index2++];
        }

        for (int i = 0,j=si; i < merged.length; i++,j++) {
            a[j]= merged[i];
        }
    }
}
