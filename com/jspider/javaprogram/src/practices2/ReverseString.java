package com.jspider.javaprogram.src.practices2;


public class ReverseString {
    public static void main(String[] args) {
        String string = "My name is Md Mohsin Haider";
        System.out.println(getStringReverse(string));
    }

    private static String getStringReverse(String string){
        String reveresString = "";
        for (int i = 0; i <string.length() ; i++) {
            char c = string.charAt(i);
            reveresString = c + reveresString;
        }
        string = reveresString;
        return string;
    }

}
