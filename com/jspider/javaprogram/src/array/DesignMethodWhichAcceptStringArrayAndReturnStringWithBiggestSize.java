package com.jspider.javaprogram.src.array;

/**
 * Question 13
 */
public class DesignMethodWhichAcceptStringArrayAndReturnStringWithBiggestSize {
    public static void main(String[] args) {
        String[] array = {"Apple","Mango","Banana","Graph","Subjects","Mohsin","Mohsij"};
        String out = designMethodWhichAcceptStringArrayAndReturnStringWithBiggestSize(array);
        System.out.println(out);
    }


    private static String designMethodWhichAcceptStringArrayAndReturnStringWithBiggestSize(String[] array) {
        String setResult = "";
        for (String e : array)
            if (e.length() >= setResult.length())
                setResult = e;
        return setResult;
    }
}
