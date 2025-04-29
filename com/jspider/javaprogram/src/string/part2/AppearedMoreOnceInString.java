package com.jspider.javaprogram.src.string.part2;


import org.jetbrains.annotations.NotNull;

public class AppearedMoreOnceInString {
    public static void main( String[] args) {
        String string = "Hello my name is Md Mohsin haider k";
        string = string.replaceAll(" ","");
        char[] chars = getElementMoreAppear(string);
        for (char aChar : chars) {
            if (aChar > '0') {
                System.out.print(aChar + ", ");
            }
        }
    }

    private static char @NotNull [] getElementMoreAppear(@NotNull String string){
        char[] element = new char[string.length()];
        int[] frequencyArray = getCharFrequency(string);
        for (int i = 0,j=0; i <string.length() ; i++) {
            if(frequencyArray[string.charAt(i)] > 1){
                char c = string.charAt(i);
                if (!(isPresent(element,c))){
                    element[j] = c;
                    j++;
                }

            }
        }
        return element;
    }


    private static int @NotNull [] getCharFrequency(@NotNull String string){
        int[] frequency = new int[127];
        for (int i = 0; i < string.length(); i++) {
            frequency[string.charAt(i)] = frequency[string.charAt(i)]+1;
        }
        return frequency;
    }

    private static boolean isPresent(char @NotNull[] element, char c){
        for (char value : element)
            if (value == c) return true;
        return false;
    }
}
