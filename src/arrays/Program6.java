package src.arrays;


/*
*       Calculate and print the sum of all the numbers of the array which is divisible by 4.
* */

public class Program6 {
    public static void main(String[] args) {
        int[] array = {1,3,5,7,9,2,4,6,8,0};
        System.out.println(evenSum(array));
    }

    public static int evenSum(int[] array){
        int evenSum=0;
        for (int p : array){
            if (p%2 == 0){
                evenSum+=p;
            }
        }
        return evenSum;
    }
}
