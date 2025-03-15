package com.jspider.javaprogram.src.string.part2;

public class FindLenghtOfString {
    public static void main(String[] args) {
        String s1 = "Hello";

        int a = findLengthByToCharArray(s1);
        System.out.println(a);

        int b = findLengthByLoop(s1);
        System.out.println(b);

        int c = findLengthByAddingNullCharter(s1);
        System.out.println(c);
    }

    // first way using toCharArray
    private static int findLengthByToCharArray(String string){
        char[] chars = string.toCharArray();
        return chars.length;
    }

    // Second way by using loop
    private static int findLengthByLoop(String string){
        int count = 0;
        try {
            for (int i = 0; ; i++) {  // Infinite loop
                string.charAt(i);  // Try accessing character
                count++;  // Increase count
            }
        } catch (IndexOutOfBoundsException e) {
            // When exception occurs, return the count as length
            return count;
        }
    }

    // Third by added null charter Value
    private static int findLengthByAddingNullCharter(String string){
        String s = string+'\0';
        return s.indexOf('\0');
    }
}

