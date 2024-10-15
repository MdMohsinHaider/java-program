package src.arrays;

public class Program4 {
    public static void main(String[] args) {
        int[] array = {1,3,5,7,9,2,4,6,8,0};
        getEvenIndex(array);
    }

    public static void getEvenIndex(int[] array){
        for (int i = 0; i <array.length ; i++) {
            if (i%2 == 0){
                System.out.println("Even index is  : "+i+" and its element is : "+ array[i]);
            }
        }
    }
}
