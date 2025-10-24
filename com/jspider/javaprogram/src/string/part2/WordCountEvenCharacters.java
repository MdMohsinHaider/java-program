package com.jspider.javaprogram.src.string.part2;

public class WordCountEvenCharacters {
    public static void main(String[] args) {
        String string = "My name is Mohsin Haider and Mohan is a Student";
        int resultCount = getCountOfEvenCharacters(string);
        System.out.println("Even Number of Words count is = " + resultCount);
    }

    private static int getCountOfEvenCharacters(String string){
        int count = 0;
        String[] words = string.toLowerCase().split(" ");
        for (String word : words) {
            if (word.length() % 2 == 0)
                count++;
        }
        return count;
    }
}
