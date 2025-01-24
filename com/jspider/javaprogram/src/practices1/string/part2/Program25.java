package com.jspider.javaprogram.src.practices1.string.part2;

import com.jspider.lib.HelpCode;

// Write a Java Program to take a String input and convert all the lowercase characters to uppercase.
public class Program25 {
    public static void main(String[] args) {
        HelpCode h = new HelpCode();
        System.out.println(toUppercaseCharacter(h.inputString()));
    }

    public static String toUppercaseCharacter(String s){
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i <s.length() ; i++) {
            char ch = s.charAt(i);
            if (ch >='a' && ch <='z'){
                ch = (char) (ch-32);
            }
            temp.append(ch);
        }
//        System.out.println(temp);
        return temp.toString();
    }
}
