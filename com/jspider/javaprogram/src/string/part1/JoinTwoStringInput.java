package com.jspider.javaprogram.src.string.part1;

import java.util.Scanner;

public class JoinTwoStringInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first String");
        String s1 = scanner.nextLine();

        System.out.println("Enter Second String");
        String s2 = scanner.nextLine();

        String result = joinTwoString(s1,s2);
        System.out.println(result);
    }

    private static String joinTwoString(String s1, String s2){
        return s1+s2;
    }
}
