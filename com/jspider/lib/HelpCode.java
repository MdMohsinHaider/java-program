package com.jspider.lib;

import java.util.Scanner;

public class HelpCode {
    //    =======================================input method===========================================================
   int count=0;
    // 1. user integer input
    public int inputInt(){
        count++;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n<======================================> "+count+" <=============================================>");
        System.out.print(count+". Enter a integer Number : ");
        return sc.nextInt();
    }

    // 2. user double input
    public double inputDouble(){
        count++;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n<======================================> "+count+" <=============================================>");
        System.out.print(count+". Enter a double Number : ");
        return sc.nextDouble();
    }

    // 3. user char input
    public char inputChar(){
        count++;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n<======================================> "+count+" <=============================================>");
        System.out.print(count+". Enter a Char  : ");
        return sc.next().charAt(0);
    }

    // 4. user String input
    public String inputString(){
        count++;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n<======================================> "+count+" <=============================================>");
        System.out.print(count+". Enter a String  : ");
        return sc.nextLine();
    }
//==============================================Calculation=================================================================

    // Check Number is Even then return true
    public static boolean isEven(int num){
        return num % 2 == 0;
    }

    // Check Number is Odd then return false
    public static boolean isOdd(int num){
        return num%2 !=0;
    }

    // Square number
    public static int getSquare(int square){
        return square*square;
    }

    // Cube number
    public static int getCube(int cube){
        return cube*cube*cube;
    }

    // power
    public static int getPower(int base, int power){
        int result=1;
        if (power==0)
            return result;

        for (int i = 1; i <=power ; i++) {
            result *= base;
        }
        return result;
    }

    // factor
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // is a Strong number
    public static boolean isStrongNumber(int number) {
        int originalNumber = number;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += factorial(digit);  // Add factorial of the digit to sum
            number /= 10;
        }
        return sum == originalNumber;  // Compare a sum with the original number
    }

    // prime number
    public static boolean isPrime(int x) {
        if (x <= 1) return false;
        for (int i = 2; i <= Math.sqrt(x); i++)
            if (x % i == 0) return false;
        return true;
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
