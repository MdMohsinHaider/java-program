package com.jspider.javaprogram.src.string;

/*
*
*       Take String input from the user and print character one by one From Starting.
*
* */


import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String :  ");
        getString(sc.nextLine());
    }

    public static void getString(String s){
        for (int i = 0; i <s.length() ; i++) {
            System.out.print(s.charAt(i)+"  ");
        }
    }
}
