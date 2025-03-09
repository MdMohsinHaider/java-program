package com.jspider.javaprogram.src.string.part1;


import java.util.Scanner;

public class ConvertAllTheCharactersToLowercase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter String");
        String s1 = scanner.nextLine();
        String re = convertLowerCase(s1);
        System.out.println(re);
        

    }

    private static String convertLowerCase(String s){
        String s1 = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >=65 && c<=90){
                s1 = s1+(char)(c+32);
            }
            else {
                s1 = s1+c;
            }
        }
        return s1;
    }
}
