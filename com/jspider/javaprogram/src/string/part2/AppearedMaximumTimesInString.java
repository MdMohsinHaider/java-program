package com.jspider.javaprogram.src.string.part2;

import java.util.Arrays;

/**
 * Write a Java Program to print the character which is appeared for the maximum times in the String.
 */
public class AppearedMaximumTimesInString {
    public static void main(String[] args) {
        String string = "Good Morning sir,First of all thank You giving me opportunity to introduced my self";
        string = string.replaceAll(" ","");
        String s = appearedMaxChar(string);
        System.out.println(s);
    }

    /**
     *
     * @param string method take String
     * @return a character which is appeared for the maximum times in the String
     */
    private static String appearedMaxChar(String string){
        int[] freArr = getFrequency(string);
        int maxFreq = 0;
        char maxChar = 0;

        // logic code
        for (int i = 0; i <freArr.length ; i++) {
            if (freArr[i] > maxFreq) {
                maxFreq = freArr[i];
                maxChar = (char) i;
            }
        }
        return String.valueOf(maxChar);
    }

    /**
     *
     * @param string this take
     * @return integer int[] array
     */
    private static int[] getFrequency(String string){
        // logic code
        int[] frequencyArray = new int[127];
        for (int i = 0; i <string.length() ; i++)
            frequencyArray[string.charAt(i)] = frequencyArray[string.charAt(i)]+1;
        System.out.println(Arrays.toString(frequencyArray));
        return frequencyArray;
    }
}

