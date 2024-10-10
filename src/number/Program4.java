package src.number;

import lib.HelpCode;

public class Program4 {
    public static void main(String[] args) {
        // main method
        HelpCode helpCode = new HelpCode();
        firstThreeDigit(helpCode.inputInt());
    }

    public static void firstThreeDigit(int num){
        if (num < 100) {
            num = 100;
        } else if (num > 999) {
            num = 100;  // If input is larger than 999, reset to 100.
        }
        System.out.println(num);
    }
}
