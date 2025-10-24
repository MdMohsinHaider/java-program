package com.jspider.javaprogram.src.array;

public class PrintAllTheEvenIndexedOfElements {
    public static void main(String[] args) {
        int[] array = {
                677, 706, 476, 194, 255, 318, 266, 793, 753, 822, 345, 940, 907, 61, 324, 502,
                934, 286, 592, 268, 816, 713, 61, 775, 209, 887, 477, 787, 217, 887, 848,
                123, 456, 789, 101, 202, 303, 404, 505, 753, 502, 268, 816, 822, 911
        };

        printAllTheEvenIndexedOfElements(array);
    }

    private static void printAllTheEvenIndexedOfElements(int[] array) {
        for (int i = 0; i < array.length; i+=2) {
            System.out.print(array[i]+" ");
        }
    }
}
