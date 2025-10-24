package com.jspider.Leetcode;

public class LongestSubString {
    public static void main(String[] args) {
        String string = "abcdefaghijk";
        String outPut = getSubString(string);
        System.out.println("outPut = " + outPut);
    }

    public static String getSubString(String string){
        String temp1 = "";
        String temp2 = "";
        String outPut = "";

        int largestTemp = 0;

        for (int i = 0; i <string.length() ; i++) {
            char c = string.charAt(i);

            if (isPresent(temp1, c)){
                continue;
            } else if (isPresent(temp2,c)){
                continue;
            }
            else {
                //
            }

        }

        string = outPut;
        return string;
    }

    private static boolean isPresent(String string, char c){
        for (int i = 0; i <string.length() ; i++) {
            if (string.charAt(i) == c) return true;
        }
        return false;
    }
}
