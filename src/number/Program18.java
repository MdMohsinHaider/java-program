package src.number;

/*
*       1*2 + 2*3 + 3*4 + 4*5 + _____________+ 99*100.
*
* */

public class Program18 {
    public static void main(String[] args) {
        getCal(99);
    }

    public static void getCal(int num){
        int sum=0;
        for (int i = 0; i <num ; i++) {
            sum += i* (i+1);
        }
        System.out.println(sum);
    }
}
