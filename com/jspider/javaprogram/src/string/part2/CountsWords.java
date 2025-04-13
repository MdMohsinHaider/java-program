package com.jspider.javaprogram.src.string.part2;

public class CountsWords {
    public static void main(String[] args) {
        String string = " Hello      My Name is Md Mohsin Haider";
        System.out.println(getWordsCount(string));
    }

    private static int getWordsCount(String string){
        String string1 = string.trim();
        int count= 0;
        for (int i = 0; i < string1.length(); i++) {
            char currentChar = string1.charAt(i); // extract current char
            if (currentChar==' '){
                char nextChar = string1.charAt(i+1); // extract next char from current char
                if (nextChar != ' '){
                    count++;
                }
            }
        }
        return count+1;
    }
}
