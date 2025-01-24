package com.jspider.javaprogram.src.array;

/**
 * <h1>Example 16</h1>
 * <p>Design a method which will insert and at array at any given position.
 */
public class DesignMethodInsertArrayAtGivenPosition {

    public static void main(String[] args) {
        int[] array = {12, 34, 56, 7, 8, 89, 90, 10};
        int indexInsert = 2;
        int insertElement = 33;
        for (int e : array)
            System.out.print(e+" ");
        System.out.println("\n");
        int[] out = designMethodInsertArrayAtGivenPosition2(array,indexInsert,insertElement);
        for (int e : out)
            System.out.print(e+" ");
    }

    private static int[] designMethodInsertArrayAtGivenPosition(int[] array, int indexInsert, int insertElement) {

        int[] newArray = new int[array.length+1];

        for (int i = 0,j=0; i < newArray.length; i++) {
            // i= 2 true j=2
//            if (i> indexInsert){
//                newArray[i] = array[j++];
//            } else if (i==indexInsert) {
//                newArray[i] = insertElement;
//            } else {
//                newArray[i] = array[j++];
//            }


            // or

            if (i==indexInsert) newArray[i] = insertElement;
            else newArray[i] = array[j++];

        }
        return newArray;
    }


    private static int[] designMethodInsertArrayAtGivenPosition2(int[] array, int indexInsert, int insertElement) {

        int[] newArray = new int[array.length+1];
        for (int i = 0,j=0; i < newArray.length; i++) {
            if (i==indexInsert) newArray[i] = insertElement;
            else newArray[i] = array[j++];
        }
        return newArray;
    }
}
