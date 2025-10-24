package com.jspider.javaprogram.src.string.part2;

/**
 * Write a Java Program to take a String input and replace all the space characters from _ in the String.
 *    <p>1. By using replace() method<p/>
 *    <p>2. Without using replace() method<p/>
 */
public class ReplaceSpaceCharactersFrom_ {
    public static void main(String[] args) {
        String string = "mj gsc   jsh uh kwe wu hw we gw boy  ";

        String stringResult = replaceUnderScoreReplaceMethod(string);
        System.out.println("With Replace Method:\n "+stringResult);

        String result = replaceUnderScore(string);
        System.out.println("Without Replace Method:\n "+ result);
    }

    private static String replaceUnderScoreReplaceMethod(String string) {
       return string.replace(' ', '_');
    }


    /**
     * Without using replace() method
     * @param string random String input
     * @return String type value
     */
    private static String replaceUnderScore(String string) {
        String s = "";
        for (int i = 0; i <string.length() ; i++) {
            char c = string.charAt(i);
            if (c == ' '){
                s = s+"_";
            }
            else
                s=s+c;
        }
        return s;
    }
}
