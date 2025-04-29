package com.jspider.javaprogram.src.pattern;

public class HollowSquare {
    public static void main(String[] args) {
        int n = 8; // Size of the square

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                // Print '*' at the borders
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    // Print space for hollow part
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
