package com.jspider.javaprogram.src.string.part1;

import java.util.Scanner;

public class FindDuplicateCharactersInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String string = scanner.nextLine();

        String result = findDuplicate(string);
        System.out.println(result);

    }

    private static boolean containsChar(String string , char character){
        for (int i = 0; i <string.length() ; i++)
            if (string.charAt(i) == character) return true;
        return false;
    }

    private static String findDuplicate(String string) {
        String duplicate = "";
        for (int i = 0; i <string.length() ; i++) {
            char c = string.charAt(i);
            if ( containsChar(string.substring(0,i),c) && !containsChar(duplicate,c))
                duplicate +=c;
        }
        return duplicate;
    }
}
