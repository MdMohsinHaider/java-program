package com.jspider.javaprogram.src.practices1.string.part2;

import java.util.Scanner;

public class Program20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input_string = scanner.nextLine();
        System.out.println(input_string);
        System.out.println(printWordFromEnd(input_string));
    }


    public static String printWordFromEnd(String s){
        String word = "";
        String final_string = "";
        for (int i = s.length()-1; i >=0 ; i--) {
            char ch = s.charAt(i);


            if (ch != ' ')
                word = word+ch;


            if ((ch == ' ' || i == 0) && !word.isBlank()) {
//                System.out.print(word + " ");
                final_string =word+" "+final_string;
                word ="";
            }

        }
//        System.out.print(final_string);
        return final_string;
    }
}
