package src.string;


/*
*
*           Take String input from the user and Get the Length of a String.
*
* */


import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String :  ");
        getStringLength(scanner.nextLine());
    }

    public static void getStringLength(String s){
        System.out.println(s.length());
    }
}
