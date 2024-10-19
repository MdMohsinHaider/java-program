package src.number;

/*
*   Write a java program to print all the factors from the user given number (number itself not included).
*
* */

import lib.HelpCode;

public class Program9 {
    public static void main(String[] args) {
        HelpCode in = new HelpCode();
        getFactor(in.inputInt());
    }

    public static void getFactor(int num){
        for (int i = 1; i <=num/2 ; i++) {
            if (num%i ==0){
                System.out.println(i);
            }
        }
    }
}
