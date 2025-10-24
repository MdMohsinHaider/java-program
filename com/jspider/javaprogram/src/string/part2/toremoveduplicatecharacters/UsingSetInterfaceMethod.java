package com.jspider.javaprogram.src.string.part2.toremoveduplicatecharacters;

import java.util.LinkedHashSet;
import java.util.Set;

public class UsingSetInterfaceMethod {
    public static void main(String[] args) {
        String str = "programming";

        StringBuilder stringBuilder = new StringBuilder();
        Set<Character> characterSet = new LinkedHashSet<>();
        for (int i = 0; i <str.length() ; i++) {
            characterSet.add(str.charAt(i));
        }
        for (Character c: characterSet){
            stringBuilder.append(c);
        }
        System.out.println(stringBuilder);
    }
}
