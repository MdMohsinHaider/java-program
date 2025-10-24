package com.jspider.javaprogram.src.practices1.Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Program6 {
    public static void main(String[] args) {
        getNonPalindrome();
    }

    public static void  getNonPalindrome(){
        Collection c1 = new ArrayList();
        c1.add(12);
        c1.add(1331);
        c1.add(565);
        c1.add(988);
        c1.add(89);
        c1.add(23);
        c1.add(45);
        c1.add(44);
        c1.add(200);
        c1.add(700);
        c1.add(13);
        System.out.println(c1);

        Iterator itr = c1.iterator();
        while (itr.hasNext()){
            int x = (int)itr.next();
            if (isPalindrome(x)) itr.remove();
        }
        System.out.println(c1);
    }

    public static boolean isPalindrome(int number) {
        int originalNumber = number; // Store the original number
        int reversedNumber = 0;
        int remainder;

        // Reverse the number
        while (number != 0) {
            remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number /= 10;
        }

        // Check if the original number is the same as the reversed number
        return originalNumber == reversedNumber;
    }
}
