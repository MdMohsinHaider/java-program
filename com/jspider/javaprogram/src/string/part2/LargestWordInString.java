package com.jspider.javaprogram.src.string.part2;

public class LargestWordInString {
    public static void main(String[] args) {
        String string = "My name is Mohsin Haider and Mohan is a Student";
        System.out.println(getLargestWord(string));
    }

    private static String getLargestWord(String string){
        String largestWord = "";
        String[] words = string.toLowerCase().split(" ");
        for (String word: words){
            if (word.length() > largestWord.length())
                largestWord = word;
        }
        return largestWord;
    }
}
