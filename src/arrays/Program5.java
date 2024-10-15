package src.arrays;

/*
*   Calculate a print sum of all elements of array
* */

public class Program5 {
    public static void main(String[] args) {
        int[] array = {1,3,5,7,9,2,4,6,8,0};
        System.out.println(getSumElement(array));
    }

    public static int getSumElement(int[] array){
        int sum =0;
        for (int p : array){
            sum+=p;
        }
        return sum;
    }
}
