package com.jspider.javaprogram.src.array;

import java.util.Arrays;

/**
 * <h1> Question 11
 */
public class DesignMethodAcceptsStringArraysPrintSizeEveryStringElement {
    public static void main(String[] args) {
        String[] name = {"Apple","Mango","Banana","Car","Bus","Bike"};

        String[] print = designMethodAcceptsStringArraysPrintSizeEveryStringElement(name);
        for (String s :print)
            System.out.println(s);
    }

    private static String[] designMethodAcceptsStringArraysPrintSizeEveryStringElement(String[] name) {
        int l = name.length;
        String[] tem = new String[l];

        for (int i = 0; i <l ; i++) {
            String s = name[i];
//            System.out.println(s+" "+s.length());
            tem[i] = s+" "+s.length();
        }
        return tem;
    }
}
