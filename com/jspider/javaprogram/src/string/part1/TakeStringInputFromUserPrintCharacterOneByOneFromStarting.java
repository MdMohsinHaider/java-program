package com.jspider.javaprogram.src.string.part1;

import java.util.Scanner;

public class TakeStringInputFromUserPrintCharacterOneByOneFromStarting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String");
        takeStringInputFromUserPrintCharacterOneByOneFromStarting(scanner);
    }

    private static void takeStringInputFromUserPrintCharacterOneByOneFromStarting(Scanner scanner) {
        String input = scanner.next();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            getPrint(c);
            getPrint(i);
        }
    }

    public static <T>void getPrint(T t){
        System.out.print(t+" ");
    }
}
