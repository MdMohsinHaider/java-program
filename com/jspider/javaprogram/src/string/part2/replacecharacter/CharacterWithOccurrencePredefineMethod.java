package com.jspider.javaprogram.src.string.part2.replacecharacter;

public class CharacterWithOccurrencePredefineMethod {
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
        int count = 1;
        for (int i = 0; i <string.length() ; i++) {
            char c = string.charAt(i);
            if (c == charToReplace){
                string= string.replaceFirst(String.valueOf(charToReplace), String.valueOf(count));
                count++;
            }
        }
        System.out.println(string);
    }
}
