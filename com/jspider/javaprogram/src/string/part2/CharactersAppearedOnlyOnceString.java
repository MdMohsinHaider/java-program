package com.jspider.javaprogram.src.string.part2;

/**
 * Write a Java Program to print the character which is appeared only once in the String. Given that, only one character has appeared once in the string.
 */

public class CharactersAppearedOnlyOnceString {
    public static void main(String[] args) {
        String string = "First of all thank you to give me opportunity to introduced my self My name is md mohsin haider";
        int[] result = getFrequencyOfCharacter(string);
        String output = getCharactersAppearedOnlyOnceString(string,result);
        System.out.println(output);
    }

    private static String getCharactersAppearedOnlyOnceString(String string, int[] frequencyArray){
        String finalResult = "";
        for (int i = 0; i <string.length() ; i++) {
            if (frequencyArray[string.charAt(i)] == 1){
                char c = string.charAt(i);
//                System.out.println(c); // if want to print
                finalResult += c;

//                break; // Since only one character appears once, break after finding
            }
        }
        return finalResult;
    }

    private static int[] getFrequencyOfCharacter(String string){
        int[] array = new int[127];
        for (int i = 0; i <string.length() ; i++) {
            array[string.charAt(i)] = array[string.charAt(i)]+1 ;
        }
        return array;
    }
}


