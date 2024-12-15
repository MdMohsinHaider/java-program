package com.jspider.javaprogram.DSA.searchingalgo;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {2,3,4,5,6,7,8,9,10,12,24,36,48,60,72,83,96,108,120,132,141,154,163,233,244,255,266,277,288,299,300,311,322,333,344,355,366,377,388,399};
        int a = getBinarySearch(array,388);
        System.out.println("Index : "+a+", Element : "+array[a]);
    }

    public static int getBinarySearch(int[] array, int key){
        int startIndex = 0;
        int endIndex = array.length-1;
        int mid = startIndex +((endIndex -startIndex)/2);
        while (startIndex <= endIndex){
            if (array[mid] == key)
                return mid;

            // going right part
            if (key > array[mid])
                startIndex = mid+1;
            // going to lift side Part
            else endIndex = mid-1;

            // mid-update according to after condition applies left and right.
            mid = (startIndex+endIndex)/2;
        }
        return -1;
    }
}
