package com.jspider.javaprogram.src.string.part2.frequency;

import java.util.Arrays;

public class FrequencyEachAlpString {
    public static void main(String[] args) {
        String string = "aabb aabc cd cd";

        int[] outPut = getSAlpFrequency(string);
//        System.out.println(Arrays.toString(outPut));

        // Print each character with its frequency
        for (int i = 0; i < outPut.length; i++) {
            if (outPut[i] > 0) {
//                System.out.println((char) i + " = " + outPut[i]);
                System.out.println((char) i+ " frequency is " + outPut[i]);
            }
        }
    }

    private static int[] getSAlpFrequency(String string){
        int[] alpFrequency = new int[127];
        for (int i = 0; i <string.length() ; i++) {
            alpFrequency[string.charAt(i)] = alpFrequency[string.charAt(i)]+1;
        }
        return alpFrequency;
    }
}
