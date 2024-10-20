package src.number;

/*
*
*       1-2 +3-4 +5-6 +7-8 + ______________+99-100.
*
* */


public class Program23 {
    public static void main(String[] args) {
        getCal();
    }

    public static void getCal(){
        int sum = 0;
        for (int i = 1; i <=100 ; i=i+2) {
//            System.out.println(i);
            sum+=i-(i+1);
        }
        System.out.println(sum);
    }
}
