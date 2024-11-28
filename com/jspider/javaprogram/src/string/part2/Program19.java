package com.jspider.javaprogram.src.string.part2;

public class Program19 {
    public static void main(String[] args) {
        String input_string = "mohan and sohan are here";
//        printWordFromEnd(input_string);
        System.out.println(printWordFromEnd(input_string));
    }


    public static String printWordFromEnd(String s){
        String word = "";
        String temp = "";
        for (int i = s.length()-1; i >=0 ; i--) {
            char ch = s.charAt(i);
            if (ch != ' ')
                word = ch +word;
            if (ch == ' ' || i == 0) {
                System.out.print(word + " ");
                word ="";
            }

        }
        return word;
    }
}
