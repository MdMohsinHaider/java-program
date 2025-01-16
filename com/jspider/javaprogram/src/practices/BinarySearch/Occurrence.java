package com.jspider.javaprogram.src.practices.BinarySearch;

public class Occurrence {
    public static void main(String[] args) {
        int[] array = {1,2,3,3,5};
        System.out.println("Element is "+array[firstOccurrence(array,3)]+" on Index is "+firstOccurrence(array,3));
        System.out.println("Element is "+array[lastOccurrence(array,3)]+" on Index is "+lastOccurrence(array,3));
    }

//    first/left most occurrence
    private static int firstOccurrence(int[] array, int key){
//
        int startIndex = 0;
        int endIndex = array.length-1;
        int mid = startIndex+((endIndex-startIndex)/2);
        int ans = -1;

        while (startIndex<=endIndex){
            if (array[mid] == key){
                ans = mid;
                endIndex = mid-1;
            } else if (key > array[mid]) { // Right me jao
                startIndex= mid+1;
            } else if (key< array[mid]) { // left me jao
                endIndex = mid-1;
            }
            mid = startIndex+((endIndex-startIndex)/2);
        }
        return ans;
    }

//    last/Right most occurrence
    private static int lastOccurrence(int[] array, int key){
        int startIndex = 0;
        int endIndex = array.length-1;
        int mid = startIndex+((endIndex-startIndex)/2);
        int ans = -1;

        while (startIndex<=endIndex){
            if (array[mid] == key){
                ans = mid;
                startIndex = mid+1;
            } else if (key > array[mid]) { // Right me jao
                startIndex= mid+1;
            } else if (key< array[mid]) { // left me jao
                endIndex = mid-1;
            }
            mid = startIndex+((endIndex-startIndex)/2);
        }
        return ans;
    }
}
