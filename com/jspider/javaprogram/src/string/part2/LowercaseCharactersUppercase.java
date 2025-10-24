package com.jspider.javaprogram.src.string.part2;

import java.util.Arrays;

/**
 *  Write a Java Program to take a String input and convert all the lowercase characters to uppercase.
 */
public class LowercaseCharactersUppercase {
    public static void main(String[] args) {
        String string = "My name is Md MohSin HaiDer And MoHan Is A Student of J Spider Institute Noida";
        System.out.println(getUpperCase(string));
    }
    private static String getUpperCase(String string){
        String upperCase = "";
        String[] words = string.split(" ");
        System.out.println(Arrays.toString(words));

        for (String word : words){
            if (!word.isEmpty()){
                for (int i = 0; i <word.length() ; i++) {
                    char charWord = word.charAt(i);
                    if (charWord >= 'a' && charWord <= 'z'){
                        charWord = (char) (charWord -' ');
                    }
                    upperCase += charWord;
                }
                upperCase += " ";

            }
            else {
                return "Not found";
            }
        }
        return  upperCase;
    }
}

