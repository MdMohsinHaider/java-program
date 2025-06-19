package com.jspider.javaprogram.src.pattern.Solid;

public class RightAngleTrangle {
    public static void main(String[] args) {
        int n = 8;
//        getSolidRightAngleTrangle(n);
//        getSolidRightAngleTrangle2(n);
//        getSolidRightAngleTrangle3(n);
        getSolidRightAngleTrangle4(n);
    }

    /**
     *
     *    *
     *    *   *
     *    *   *   *
     *    *   *   *   *
     *    *   *   *   *   *
     *    *   *   *   *   *   *
     *
     * @param n number of lines
     */
    private static void getSolidRightAngleTrangle(int n){
        // code
        int star = 1;
        for (int i = 1; i <=n ; i++) {

            // star print loop
            for (int j = 1; j <=star ; j++) {
                System.out.print("* ");
            }
            star++;
            System.out.println(); // line change

        }
    }

    /**
     *                               *
     *                           *   *
     *                       *   *   *
     *                   *   *   *   *
     *               *   *   *   *   *
     *            *  *   *   *   *   *
     *
     *  @param n number of lines
     */
    private static void getSolidRightAngleTrangle2(int n){

        // space and star intinal setup
        int star = 1;
        int space = n;

        for (int i = 1; i <=n ; i++) {

            // space print loop
            for (int j = 1; j <space ; j++) {
                System.out.print("  ");
            }

            // star print loop
            for (int j = 1; j <=star ; j++) {
                System.out.print("* ");
            }
            System.out.println(); // line change

            // space and star increasing and decreasing setup
            space--;
            star++;
        }
    }

    /**

     *          *   *   *   *   *
     *          *   *   *   *
     *          *   *   *
     *          *   *
     *          *
     *
     * @param n number of lines
     */
    private static void getSolidRightAngleTrangle3(int n){

        int star = n;

        for (int i = 1; i <=n ; i++) {

            // star print loop
            for (int j = 1; j <= star ; j++) {
                System.out.print("* ");
            }
            System.out.println(); // line change

            // star decreasing
            star--;
        }
    }


    /**
     *                *   *   *   *   *   *
     *                    *   *   *   *   *
     *                        *   *   *   *
     *                            *   *   *
     *                                *   *
     *                                    *
     *
     * @param n numbers of lines
     *
     */
    private static void getSolidRightAngleTrangle4(int n){
        int star = n;
        int space = 1;

        for (int i = 1; i <=n ; i++) {

            // space print loop
            for (int j = 1; j <=space ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=star ; j++) {
                System.out.print("* ");
            }
            System.out.println(); // line change

            // space increasing and star decreasing
            space++;
            star--;

        }
    }



}


