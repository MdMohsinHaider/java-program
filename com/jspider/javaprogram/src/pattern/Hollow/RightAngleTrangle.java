package com.jspider.javaprogram.src.pattern.Hollow;

public class RightAngleTrangle {
    public static void main(String[] args) {
        int n = 8;
//        getRightAngleTrangle(n);
//        getRightAngleTrangle2(n);
//        getRightAngleTrangle3(n);
        getRightAngleTrangle4(n);
    }

    /**
     *
     *    *
     *    *   *
     *    *       *
     *    *           *
     *    *               *
     *    *   *   *   *   *   *
     *
     * @param n number of lines
     */
    private static void getRightAngleTrangle(int n){
        // code
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n ; j++) {
                // print star
                if ( i==n || j==i || j==1){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    /**
     *
     *      *   *   *   *   *   *   *
     *      *                   *
     *      *               *
     *      *           *
     *      *       *
     *      *   *
     *      *
     *
     *
     * @param n number of lines
     */
    private static void getRightAngleTrangle2(int n){
        // code
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                // print Star
                if (j==1 || i==1 || (i+j)==(n+1)){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }


    /**
     *
     *                      *
     *                  *   *
     *              *       *
     *           *          *
     *        *             *
     *     *                *
     *   *                  *
     * * *  *   *   *   *   *
     *
     * @param n number of lines
     */
    private static void getRightAngleTrangle3(int n){
        // code`
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                if ((i+j)==(n+1) || i==n || j==n){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    /**
     *
     *      *   *   *   *   *   *   *
     *          *                   *
     *              *               *
     *                  *           *
     *                      *       *
     *                          *   *
     *                              *
     * @param n number of lines
     */
    private static void getRightAngleTrangle4(int n){
        // code
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                if (i==1 || i==j || j==n){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

}
