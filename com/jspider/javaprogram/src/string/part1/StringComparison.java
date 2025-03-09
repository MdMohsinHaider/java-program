package com.jspider.javaprogram.src.string.part1;

import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First String");
        String s1 = scanner.nextLine();

        System.out.println("Enter Second String");
        String s2 = scanner.nextLine();

        findUniqueAndDuplicateCharacters(s1,s2);

        scanner.close();
    }

    // Check charter is contained or not in string.
    private static boolean containsChar(String str, char ch) {
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i) == ch) return true;
        }
        return false;
    }

    private static void findUniqueAndDuplicateCharacters(String s1, String s2) {
        String duplicate = "";
        String unique = "";

        // Finding duplicates (common characters)
        for (int i = 0; i <s1.length() ; i++) {
            char c = s1.charAt(i);
            if (containsChar(s2,c) && !containsChar(duplicate,c)){
                duplicate += c;
            }
        }
        System.out.println("duplicate: "+duplicate);

        // Finding unique characters
        for (int i = 0; i <s1.length() ; i++) {
            char c = s1.charAt(i);
            if (!containsChar(s2,c) && !containsChar(unique,c))
                unique += c;
        }
        for (int i = 0; i <s2.length() ; i++) {
            char c = s2.charAt(i);
            if (!containsChar(s1,c) && !containsChar(unique,c))
                unique += c;
        }
        System.out.println("unique: "+unique);
    }
}
