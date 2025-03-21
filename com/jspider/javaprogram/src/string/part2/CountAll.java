package com.jspider.javaprogram.src.string.part2;


    /**
     * Write a Java Program to take a String input and count all
     * the
     * space characters,
     * uppercase,
     * lowercase,
     * numeric,
     * special characters
     * in the String.
     */
public class CountAll {
        public static void main(String[] args) {
            String string = "asA @S $ 448 / D86 %$ h878 ^ 989 * 3";
            getCountAll(string);
        }

        private static void getCountAll(String string){
            int countSpaceChar = 0;
            int countUpper = 0;
            int countLower = 0;
            int countNumerical = 0;
            int countSpecialCharacter = 0;

            for (int i = 0; i <string.length() ; i++) {
                char c = string.charAt(i);
                if (c >='a' && c <='z') countLower++;
                if (c >='A' && c <='Z') countUpper++;
                if (c >='0' && c <='9') countNumerical++;
                if (c ==' ') countSpaceChar++;
                if (c=='!' || c=='@' || c=='#' || c=='$' || c=='%' || c=='^' || c=='&'|| c=='*' || c=='(' || c==')' || c=='_' || c=='-' || c=='=' || c=='+' || c=='/' || c=='?')
                    countSpecialCharacter++;
            }
            System.out.println("countSpecialCharacter = " + countSpecialCharacter);
            System.out.println("countSpaceChar = " + countSpaceChar);
            System.out.println("CountNumerical = " + countNumerical);
            System.out.println("countLower = " + countLower);
            System.out.println("countUpper = " + countUpper);
        }
}
