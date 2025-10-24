package com.jspider.javaprogram.src.string.part2.replacecharacter;


import java.util.Arrays;

public class CharacterWithOccurrence {
    public static void main(String[] args) {
        String string = "open text";
        string = string.replaceAll(" ","");
        char charToReplace = 't';

        // check charter is available or not in string.
        if (string.indexOf(charToReplace) == -1){
            System.out.println("Not Avl Character in String");
            System.exit(0);
        }

        // logic for Replace Character With its Occurrence.
        char[] arr = string.toCharArray();
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == charToReplace){
                arr[i] = String.valueOf(count).charAt(0);
                count++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
