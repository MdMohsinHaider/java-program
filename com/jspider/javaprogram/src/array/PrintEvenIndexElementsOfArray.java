package com.jspider.javaprogram.src.array;

/**
 *  <h1>Question 25
 */
 public class PrintEvenIndexElementsOfArray {
    public static void main(String[] args) {
        int[] testCase = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
        printEvenIndexElementsOfArray(testCase);
    }

     private static void printEvenIndexElementsOfArray(int[] testCase) {
        int count = 0;
         for (int i = 0; i <testCase.length ; i=i+2){
             System.out.print(testCase[i] +" ");
             count++;
         }
         System.out.println("\n"+testCase[testCase.length-1]);
         System.out.println(testCase.length-1);
         System.out.println(count);
     }


 }
