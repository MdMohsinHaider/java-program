package com.jspider.javaprogram.src.string.part2.frequency;

public class FrequencyEachCharacterString {
    public static void main(String[] args) {
        String string = "\0 hello I am md Mohsin Haider and Mohan is a Student of J or Q spider Institute in Noida Branch";
        System.out.println();
        int[] result = getFrequencyEachCharacter(string);
        for (int j : result) {
            if (j >= 0) {
                System.out.print(j + " ");
            }
        }
    }

    private static int[] getFrequencyEachCharacter(String string){
        int[] array = new int[127];
        for (int i = 0; i <string.length() ; i++) {
            array[string.charAt(i)] = array[string.charAt(i)]+1;
        }
        return array;
    }

}
