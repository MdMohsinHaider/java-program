package com.jspider.javaprogram.src.practices2;

public class ReverseWord {
    public static void main(String[] args) {
        String string = "My name is Md Mohsin Haider";
        String s = getReverseWord(string);
        System.out.println(s); // yM eman si dM nishoM rediaH
    }

    private static String getReverseWord(String string){
        String revTempWord = "";
        String[] words = string.split(" ");
        for (String word:words){
//            revTempWord  += reveresWord(word) + " ";
            revTempWord = revTempWord + reveresWord(word)+" ";
        }
        string = revTempWord;
        return string.trim();
    }

    private static String reveresWord(String string){
        String temp = "";
        for (int i = 0; i <string.length() ; i++) {
            char c = string.charAt(i);
           temp = c + temp;
        }
        string = temp;
        return string;
    }

}
