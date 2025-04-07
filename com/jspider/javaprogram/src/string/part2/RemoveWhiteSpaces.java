package com.jspider.javaprogram.src.string.part2;

import java.nio.charset.StandardCharsets;

public class RemoveWhiteSpaces {
    public static void main(String[] args){
        String string = " j  a  va Pro gram   m ing ";
        removeA11WhiteSpaces(string);
    }

    private static void removeA11WhiteSpaces(String string) {
//        System.out.println(string.trim()); //j  a  va Pro gram   m ing
        String string1 = string.replaceAll("\\s","");
        System.out.println(string1);
    }
}
