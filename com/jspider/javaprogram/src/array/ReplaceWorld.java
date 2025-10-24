package com.jspider.javaprogram.src.array;

import java.util.Scanner;

public class ReplaceWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = "Noida";
        String replace = "id";
        System.out.println("enter new Words");
        String newWorld = scanner.nextLine();
        String output = getReplaceWorld(string,replace,newWorld);
        System.out.println(output);
    }

    private static String getReplaceWorld(String string, String replace, String newWorld){
        if (string.contains(replace))
            return string.replace(replace,newWorld);
        else
            return string;
    }
}
