package com.jspider.javaprogram.src.string.part2;

import java.util.LinkedList;
import java.util.List;

/**
 * Write a Java Program to take a String input and print all 
 * the indexes where space characters are present in the String.
 */
public class IndexesWhereSpaceCharacters {
    public static void main(String[] args) {
        String string = "mj gsc  jsh uh kwe wu hw we gw boy  ";
        List<Integer> integerList = getSpaceIndex(string);
        System.out.println(integerList);
    }

    private static List<Integer> getSpaceIndex(String string) {
        String string1 = string+'\0';
        List<Integer> integerList = new LinkedList<>();
        for (int i = 0; i < string1.indexOf('\0') ; i++) {
            char c = string.charAt(i);
            if (c == ' ')
                integerList.add(i);
        }
        return integerList;
    }
}
