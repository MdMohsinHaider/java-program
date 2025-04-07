package com.jspider.javaprogram.src.string.part2;

public class CountsWords {
    public static void main(String[] args) {
        String string = " Hello    My Name is Md Mohsin Haider";
        System.out.println(getWordsCount(string));
    }

    private static int getWordsCount(String string){
        String string1 = string.trim();
        int count= 0;
        for (int i = 0; i < string1.length(); i++) {
            char currentC = string.toLowerCase().charAt(i);
//            if (c==' ' && !(string.charAt(i) >= 'a' && string.charAt(i) <='z')) count++;
            if (currentC==' '){
                char nextC = string.charAt(i+1);
                if (nextC != ' ')
                    count++;
            }
        }
        return count+1;
    }
}
