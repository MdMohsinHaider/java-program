package com.jspider.javaprogram.src.practices2;

public class ReverseStringWord {
    public static void main(String[] args) {
        String string = "My name is Md Mohsin Haider";
        String result = getReverseStringWord(string);
        System.out.println(result);
    }

    private static String getReverseStringWord(String string){
        String temp = "";
        String[] words = string.split(" ");
        for (String word : words){
            temp = word + " " + temp;
        }
        string = temp.trim();
        return string;
    }

}
