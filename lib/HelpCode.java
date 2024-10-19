package lib;

import java.util.Scanner;

public class HelpCode {
    //    =======================================input method===========================================================
    // 1. user integer input
    public int inputInt(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a integer Number : ");
        return sc.nextInt();
    }

    // 2. user double input
    public double inputDouble(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a double Number : ");
        return sc.nextDouble();
    }

    // 3. user char input
    public char inputChar(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Char  : ");
        return sc.next().charAt(0);
    }

    // 4. user String input
    public String inputString(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String  : ");
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

    // check number is prime or not
    public static boolean isPrime(int x) {
        if (x <= 1) return false;
        for (int i = 2; i <= Math.sqrt(x); i++)
            if (x % i == 0) return false;
        return true;
    }

}
