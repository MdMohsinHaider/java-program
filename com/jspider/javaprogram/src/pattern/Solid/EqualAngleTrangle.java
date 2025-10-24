package com.jspider.javaprogram.src.pattern.Solid;

public class EqualAngleTrangle {
    public static void main(String[] args) {
        int n = 8;
//        getEqualAngleTrangle(n);
        getEqualAngleTrangle2(n);
    }

    /**
     *                  *
     *                * * *
     *              * * * * *
     *            * * * * * * *
     *          * * * * * * * * *
     */
    private static void getEqualAngleTrangle(int n){
        int space = n;
        int star = 1;

        for (int i = 1; i <=n ; i++) {

            // space print loop
            for (int j = 1; j <=space ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= star ; j++) {
                System.out.print("* ");
            }
            System.out.println(); // line change

            space--; // space decreasing by 1
            star+=2; // after twice star print
        }
    }

    /**
     *          * * * * * * * * *
     *            * * * * * * *
     *              * * * * *
     *                * * *
     *                  *
     */
    private static void getEqualAngleTrangle2(int n){
        int space = 1;
        int star = (2*n)-1;

        for (int i = 1; i <=n ; i++) {

            // space print Loop
            for (int j = 1; j <=space ; j++) {
                System.out.print("  ");
            }
            // star print loop
            for (int j = 1; j <=star ; j++) {
                System.out.print("* ");
            }
            System.out.println(); // line change

            space++;
            star-=2;
        }
    }
}
