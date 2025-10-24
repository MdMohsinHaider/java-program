import com.jspider.lib.HelpCode;
import com.jspider.lib.NumberRangeFinder;
import com.jspider.lib.PermutationGenerator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello java Programmer");
//        infiniteStrongNumber();
//        infinitePalindrom();
//        infinitePrimeNumber();
//        runnableNumberCheck();
        runnablePermutationGenerator();

    }

    public static void infiniteStrongNumber(){
        int count =0;
        for (int i = 0; ; i++) {
            count++;
            if (HelpCode.isStrongNumber(i)){
                System.out.println(i +" < : number : "+count);
            }
        }
    }

    public static void infinitePalindrom(){
        for (int i = 0; ; i++) {
            if (HelpCode.isPalindrome(i)){
                System.out.println(i);
            }
        }
    }

    public static void infinitePrimeNumber(){
        for (int i = 0; ; i++) {
            if (HelpCode.isPrime(i)){
                System.out.println(i);
            }
        }
    }

    private static void runnableNumberCheck(){
        Scanner scanner = new Scanner(System.in);

        // Input range
        System.out.print("Enter the starting number of the range: ");
        int from = scanner.nextInt();
        System.out.print("Enter the ending number of the range: ");
        int to = scanner.nextInt();

        // Input target number
        System.out.print("Enter the 3-digit number to find: ");
        int target = scanner.nextInt();

        // Validate target as a 3-digit number
        if (target < 100 || target > 999) {
            System.out.println("Error: Please enter a valid 3-digit number.");
            return;
        }

        // Create and start the thread
        NumberRangeFinder finder = new NumberRangeFinder(from, to, target);
        Thread thread = new Thread(finder);
        thread.start();
    }


    private static void runnablePermutationGenerator(){
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a number or string: ");
        String input = scanner.nextLine();

        // Create and start the thread
        PermutationGenerator generator = new PermutationGenerator(input);
        Thread thread = new Thread(generator);
        thread.start();
    }
}
