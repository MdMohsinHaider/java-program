package com.jspider.javaprogram.src.string.part2;

/**
 * Write a Java Program to convert the first character of each word of a String into upper case.
 */

public class ConvertFirstCharacterWordStringUpperCase {
    public static void main(String[] args) {
        String string = "my name is md Mohsin haider and Mohan is a student";
        System.out.println(getPascalCase(string));
    }

    private static String getPascalCase(String string){
        String pascalCaseString = "";

        String[] words = string.split(" ");

        for (String word : words){
            if (!word.isEmpty()){

                char firstCharacter = word.charAt(0);
                String remainingWordCharacter = word.substring(1);

                if (firstCharacter >= 'a' && firstCharacter <= 'z'){
                    firstCharacter = (char)(firstCharacter - ' ');
                }
                pascalCaseString = pascalCaseString+firstCharacter+remainingWordCharacter+" ";
            }
            else return null;

        }
        return pascalCaseString;
    }
}
