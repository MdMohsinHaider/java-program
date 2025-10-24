package com.jspider.javaprogram.src.string.part2;

/**
 * Write a Java Program to take a String input and count all the vowel characters in the String.
 */
public class CountVowel {
    public static void main(String[] args) {
        String string = "I am Mohsin Haider And I am a Software Engineer";
        int VowelCount = getVowelCount(string);
        System.out.println("VowelCount = " + VowelCount);
    }
    
    private static int getVowelCount(String string){
        int count = 0;
        for (int i = 0; i <string.length() ; i++) {
            char c = string.charAt(i);
            if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
                count++;
        }
        return count;
    }
}
