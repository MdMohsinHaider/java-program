package com.jspider.javaprogram.DSA.searchingalgo;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10,12,13,14,22,33,44,55,66,77,88,99};
        int a =  linearSearch(array,3 );
        int b = linearSearch2(array,3);
        int c = linearSearch3(array,3);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }


    /**
     * Without using Index, get a value and return only a value.
     * @param array is already shorted in order.
     * @param key which is user wants to find number.
     * @return target Value
     */
    private static int linearSearch(int[] array, int key){
        int result = 0;
        for (int a :array){
            if (a == key)
                result=a;
        }
        return result;
    }

    /**
     * Another way using index and return
     * target index as well as target Number.
     * @param array is already shorted in order.
     * @param key which is user wants to find number.
     * @return target index as well as target Number or Value
     */
    private static int linearSearch2(int[] array, int key){
        int i = 0;
        for (int a :array){
            if (a == key)
                return i; // return index of target number
//                return array[i]; // return Direct number
            i++;
        }
        return 0;
    }


        /**
         * Another way of using traditional For loop
         * with using index and return target index as well as
         * target Number.
         * @param array is already shorted in order.
         * @param key which is user wants to find number.
         * @return target Value
         */
        private static int linearSearch3(int[] array, int key){
            int length = array.length-1;
            for (int i = 0; i <length ; i++) {
                if (array[i]==key)
                    return i; // return target element index.
//                    return array[i]; // return target element value.
            }
            return 0;
        }
}
