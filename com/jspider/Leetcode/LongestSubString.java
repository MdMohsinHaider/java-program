package com.jspider.Leetcode;

public class LongestSubString {
    public static void main(String[] args) {
        String string = "abcdefaghijk";
        String outPut = getSubString(string);
        System.out.println("outPut = " + outPut);
    }

    public static String getSubString(String string){
        String temp = "";
        int largestTemp = 0;
        for (int i = 0; i <string.length() ; i++) {
            char c = string.charAt(i);

            if (isPresent(temp,c)){
                if (temp.length() > largestTemp){

                }
            }

            // Remove duplicate
            if (!(isPresent(temp,c))){
                temp+=c;
            }
        }

        string = temp;
        return string;
    }

    private static boolean isPresent(String string, char c){
        for (int i = 0; i <string.length() ; i++) {
            if (string.charAt(i) == c) return true;
        }
        return false;
    }
}
