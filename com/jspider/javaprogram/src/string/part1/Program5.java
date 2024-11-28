package com.jspider.javaprogram.src.string.part1;

    /*
     * @Problem Statement:
     *
     * 1. Take two strings as user input.
     * 2. Compare the characters of both strings.
     * 3. Identify and print:
     *    a. Duplicate characters (characters that appear in both strings).
     *    B. Unique characters (characters that appear only in one of the strings).
     *
     * @Approach:
     *
     * - Read two strings from the user.
     * - Convert strings to character arrays or use sets for easier comparison.
     * - Use data structures like HashSet to keep track of:
     *     - Common characters (duplicates).
     *     - Unique characters from both strings.
     * - Iterate through the characters of both strings:
     *     - Check which characters appear in both strings (duplicates).
     *     - Check which characters appear only in one of the strings (unique).
     * - Print the results.
     * - Take two String user input and Compare to Strings Character
     *   - and find and print both duplicate or unique characters.
     */


public class Program5 {
    public static void main(String[] args) {
        String s1 = "common";
        String s2 = "iterate";
        int[] a = getFreqArray(s1);
        for (int a1:a){
            System.out.println(a1);
        }
    }

    private static void getDuplicateCharacter(String s1, String s2){

    }

    private static int[] getFreqArray(String s1){
        int[] freq = new int[26];
        for (int i = 1; i <s1.length() ; i++) {
            char ch = s1.charAt(i);
            if (ch >='A' && ch<='z')
                freq[ch-65]++;
            else if (ch >=97 && ch<= 122 )
                freq[ch-97]++;
        }
        return freq;
    }
}
