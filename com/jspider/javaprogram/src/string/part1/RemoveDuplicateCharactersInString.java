package com.jspider.javaprogram.src.string.part1;

import java.util.Scanner;

public class RemoveDuplicateCharactersInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String");
        String string = scanner.nextLine();

        String result = removeDuplicateChar(string);
        System.out.println(result);
    }

    private static boolean containsChar(String string, char ch){
        for (int i = 0; i <string.length() ; i++) {
            if (string.charAt(i) == ch) return true;
        }
        return false;
    }

    private static String removeDuplicateChar(String string) {
        String unique = "";

        for (int i = 0; i <string.length() ; i++) {
            char ch = string.charAt(i);
            if (!containsChar(unique,ch))
                unique+=ch;
        }
        return unique;
    }
}

