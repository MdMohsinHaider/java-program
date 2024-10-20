package src.number;

/*
*
*       1*2^2+ 2*3^2 + 3*4^2 + 4*5^2 + _____________+ 99*100^2.
*
* */


public class Program19 {
    public static void main(String[] args) {
        getCal();
    }

    public static void getCal(){
        int sum=0;
        for (int i = 1; i <=100 ; i++) {
            sum += i*((i+1)*(i+1));
        }
        System.out.println(sum);
    }
}
