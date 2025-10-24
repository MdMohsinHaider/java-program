package com.jspider.javaprogram.src.string.part2.frstnonrepeatedcharacter;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String string = "A A B C D B E";
        string = string.replaceAll(" ","");
        char c = getFirstNonRepeatedChar(string);
        System.out.println(c);
    }
    private static char getFirstNonRepeatedChar(String string){
        for (int i = 0; i < string.length(); i++) {
            boolean unique = true;
            for (int j = 0; j <string.length() ; j++) {
                if (i!=j && string.charAt(i) == string.charAt(j)){
                    unique = false;
                    break;
                }
            }
            if (unique) return string.charAt(i);
        }
        return '1';
    }
}
