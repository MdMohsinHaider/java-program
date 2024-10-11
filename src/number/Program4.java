package src.number;

import lib.HelpCode;

public class Program4 {
    public static void main(String[] args) {
        // main method
        HelpCode helpCode = new HelpCode();
        System.out.println( firstThreeDigit(helpCode.inputInt()));
    }

    public static String firstThreeDigit(int num){
        String temp ="";
        while (num>99){
            temp=""+num;
            num/=10;
        }
        return temp;
    }
}
