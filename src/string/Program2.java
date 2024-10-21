package src.string;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String :  ");
        getString(scanner.nextLine());
    }

    public static void getString(String s){
        for (int i = s.length() -1 ; i >= 0 ; i--) {
            System.out.print(s.charAt(i)+"  ");
        }
    }
}
