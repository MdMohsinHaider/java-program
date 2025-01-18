package com.jspider.javaprogram.src.array;

/**
 * <h1>Question number 8
 */
public class DesignMethodWhichReturnTheBiggestAndSmallestDifference {
    public static void main(String[] args) {
        int[] array = {
                677, 706, 476, 194, 255, 318, 266, 793, 753, 822, 345, 940, 907, 61, 324, 502,
                934, 286, 592, 268, 816, 713, 61, 775, 209, 887, 477, 787, 217, 887, 848,
                123, 456, 789, 101, 202, 303, 404, 505, 753, 502, 268, 816, 822, 911
        };

        int[] arr ={12,13};

        int bigSmallDif = designMethodWhichReturnTheBiggestAndSmallestDifference(array);
        System.out.println(bigSmallDif);
    }

    private static int designMethodWhichReturnTheBiggestAndSmallestDifference(int[] array) {
        if (array.length == 0)
           return -1;

        if (array.length == 1)
            return 0;

        if (array.length ==2){
            if (array[0] > array[1])
                return array[0]-array[1];
            if (array[0] < array[1])
                return array[1]-array[0];
        }

        int bigNum = Integer.MIN_VALUE;
        int smallNum = Integer.MAX_VALUE;

        for (int n:array){
            if (n > bigNum)
                bigNum = n;
        }
        System.out.println(bigNum);

        for (int n:array){
            if (n < smallNum)
                smallNum=n;
        }
        System.out.println(smallNum);
        return bigNum-smallNum;
    }
}
