package com.jspider.javaprogram.src.string.part2;


/**
 * Write a Java Program for the below requirements:
 * i/p: mohan and sohan are here.
 * o/p: here are sohan and mohan
 */
public class ReverseWordsInString {
    public static void main(String[] args) {
        String string = "mohan and sohan are here";
        String rev = reverseWordsString(string);
        System.out.println(rev);
    }

    private static String reverseWordsString(String string){

        // Split input into words
        String[] words = string.split(" ");

        // Reverse the words using String concatenation
        String output = "";

        for (int i = words.length - 1; i >= 0; i--) {
            output += words[i];
            if (i != 0) {
                output += " ";
            }
        }
        return output;
    }
}

