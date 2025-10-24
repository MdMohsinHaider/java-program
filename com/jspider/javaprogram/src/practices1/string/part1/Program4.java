package com.jspider.javaprogram.src.practices1.string.part1;


/*
*
*   Take Two String input from the user and join Two Strings to each other.
*
*
* */


import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Two String :  ");
        getJoinString(scanner.nextLine(),scanner.nextLine());
    }

    public static void getJoinString(String s1, String s2){
        System.out.println(s1+" "+s2);
    }
}
