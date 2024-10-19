import lib.HelpCode;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello java Programmer");
//       infiniteStrongNumber();
//        infinitePalindrom();
        infinitePrimeNumber();
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


}
