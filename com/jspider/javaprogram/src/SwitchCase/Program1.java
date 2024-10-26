package com.jspider.javaprogram.src.SwitchCase;

import com.jspider.lib.HelpCode;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HelpCode in = new HelpCode();
        System.out.print("Enter + - * / % : ");
       char ch = sc.next().charAt(0);
        cal(in.inputInt(),ch,in.inputInt());

    }

    public static void cal(int first ,char opt, int sec){
        switch (opt){
            case '+':
                System.out.println(first+sec);
                break;
            case '-':
                System.out.println(first-sec);
                break;
            case '*':
                System.out.println(first*sec);
                break;
            case '/':
                System.out.println(first/sec);
                break;
            case '%':
                System.out.println(first%sec);
                break;
            default:
                System.out.println("wrong input");
        }
    }

}
