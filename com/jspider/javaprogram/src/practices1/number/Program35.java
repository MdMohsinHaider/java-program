package com.jspider.javaprogram.src.practices1.number;

/*
*
*   Write a java Program to check and print number is Happy Number or not.
*
* */


import java.util.HashSet;
import java.util.Set;

public class Program35 {
    public static void main(String[] args) {
        System.out.println(isHappyNumber(7));
    }


    public static boolean isHappyNumber(int n){
        Set<Integer> integerSet = new HashSet<>();
        while (true){

            // Find the Sum os Squares
            int sum = 0;
            while (n != 0){
                sum += (int) Math.pow(n%10,2.0);
                n=n/10;
            }

            // if a sum is 1, return true.
            if ((sum==1)) return true;

            //Else, the new number is the current sum
            n =sum;

            // check if we have already encountered.
            if (integerSet.contains(n))
                return false;
            integerSet.add(n);
        }
    }
}
