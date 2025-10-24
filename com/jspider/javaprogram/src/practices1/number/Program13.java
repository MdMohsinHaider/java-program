package com.jspider.javaprogram.src.practices1.number;

import com.jspider.lib.HelpCode;

public class Program13 {

    public static void main(String[] args) {
        HelpCode i = new HelpCode();
        int result = getSum(i.inputInt(),i.inputInt());
        System.out.println(result);
    }

    public static int getSum(int num1, int num2){
        return num1+num2;
    }
}
