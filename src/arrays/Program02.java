package src.arrays;

public class Program02 {
    public static void main(String[] args) {
        int[] a = {12,8,5,12,5,12,10,12,12};
        printFrequency(a);
    }

    public static void printFrequency(int[] a){
        int n = a.length;
        for (int i = 0; i <n ; i++) {
            int count = 1;
            for (int j = i+1; j <n ; j++) {
                if (a[i] == a[j]){
                    count++;
                    a[j]=a[n-1];
                    n--;
                    j--;
                }
            }
        System.out.println(a[i]+" is : "+count+" times");
        }
    }
}
