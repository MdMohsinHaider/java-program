package com.jspider.javaprogram.src.string.part1;

import java.util.Scanner;

public class ConvertAllTheCharactersToUpperCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String value = convertToUpperCase(scanner);
        System.out.println(value);
    }

    private static String convertToUpperCase(Scanner scanner){
        System.out.println("Enter String");
        String input = scanner.nextLine();

        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c>='a' && c<='z'){
                result += (char)(c-32);
            }
            else result += c;
        }
        return result;
    }
}
