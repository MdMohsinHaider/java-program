package com.jspider.javaprogram.src.string.part1;

public class AlphabetFind {
    public static void main(String[] args) {
        String s = " u&Abvfg ^ $1hJ2 L133";
        String result = findAlphabets(s);
        System.out.println(result);

    }

    private static String findAlphabets(String s){
        String s1 = "";
        for (int i = 0; i <s.length() ; i++) {
            char c = s.charAt(i);
            if (c >= 65 && c<=90 || c>= 97 && c<=122){
                s1 = s1+c;
            }
        }
        System.out.println(s1);
        return s1;
    }
}
