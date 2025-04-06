package com.jspider.javaprogram.src.string.part2;

public class RemoveDuplicateCharacters {
    public static void main(String[] args) {
        String string = "aahgawzzwaazwqwxw";
        String rmd = removeDuplicates(string);
        System.out.println(rmd);
    }

    private static String removeDuplicates(String string) {
        String unqieString = "";
        for (int i = 0; i <string.length(); i++) {
            char c = string.charAt(i);
            if (!(isPresent(unqieString,c))){
                unqieString += c;
            }
        }
        return unqieString;
    }

    private static boolean isPresent(String string, char c) {
        for (int i = 0; i < string.length(); i++) {
            char c1 = string.charAt(i);
            if (c1==c) return true;
        }
        return false;
    }
}
