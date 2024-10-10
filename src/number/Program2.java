package src.number;

/*
* Take Input a Random Number from the user and print the last three-digit number.
*
* */

import lib.HelpCode;

public class Program2 {
    public static void main(String[] args) {
        // main method
        HelpCode helpCode = new HelpCode();
        printLastThreeDigit(helpCode.inputInt());
    }

    public static void printLastThreeDigit(int num){
        // code
        System.out.println(num%1000);
    }

}
