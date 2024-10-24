package DSA.SortingAlgo;

public class BubbleSortAlgo {
    public static void main(String[] args) {
        int[] array1 ={30,40,70,50,90,100};
        int[] array2 ={30,40,50,70,90,100};

        getSort(array2);

        // Print Array elements.
        for (int p : array2){
            System.out.println(p);
        }
    }

    public static void getSort(int[] a){
        int n = a.length;
        for (int i = 0; i <n-1 ; i++) {
            int x = 0;
            for (int j = 0; j <n-1-i ; j++) {
                if (a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    x++;
                }
            }
            if (x==0) break;
        }
    }
}
