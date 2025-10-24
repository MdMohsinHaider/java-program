package com.jspider.javaprogram.src.string.part2.sortstringcharactersalphabeticalorder;

import java.util.Arrays;

public class UsingSortMethod {
    public static void main(String[] args) {
        String string = " qwerty ui op as df gh jk lz xc vb nm ";
        char[] charArray = string.replaceAll("\\s","").toCharArray();
        Arrays.sort(charArray);

//        System.out.println(charArray);
        System.out.println(new String(charArray));

    }
}
