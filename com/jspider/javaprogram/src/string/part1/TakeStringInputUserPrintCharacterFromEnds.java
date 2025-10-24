package com.jspider.javaprogram.src.string.part1;

import java.util.Scanner;

public class TakeStringInputUserPrintCharacterFromEnds {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String");
        takeStringInputUserPrintCharacterFromEnds(scanner);
    }

    private static void takeStringInputUserPrintCharacterFromEnds(Scanner scanner) {
        String input = scanner.next();
        for (int i = input.length()-1; i >=0 ; i--) {
            char c = input.charAt(i);
            getPrint(c);
        }
    }

    public static <T> void getPrint(T t){
        System.out.print(t+" ");
    }
}
