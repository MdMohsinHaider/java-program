package com.jspider.javaprogram.src.array;

/**
 * <h1>Question 10
 */
public class DesignMethodWhichWillReturnProductArrayEven {
    public static void main(String[] args) {
        long[] array = {
                67, 76, 46, 14, 25, 38, 26, 73, 75, 22, 45, 40, 7, 61, 324, 502
        };

        long productEvenNum = designMethodWhichWillReturnProductArrayEven(array);
        System.out.println(productEvenNum);
    }

    private static long designMethodWhichWillReturnProductArrayEven(long[] array) {
        long tempProduct = 1;
        for (long n: array)
            if (n%2 ==0 )
                tempProduct = tempProduct*n;
        return tempProduct;
    }
}
