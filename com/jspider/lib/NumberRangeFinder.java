package com.jspider.lib;

public class NumberRangeFinder implements Runnable {
    private int from;
    private int to;
    private int target;

    public NumberRangeFinder(int from, int to, int target) {
        this.from = from;
        this.to = to;
        this.target = target;
    }

    @Override
    public void run() {
        boolean isFound = false;
        System.out.println("All possible numbers in the range:");
        for (int i = from; i <= to; i++) {
            System.out.print(i + " ");
            if (i == target) {
                isFound = true;
            }
        }
        System.out.println(); // Move to a new line
        if (isFound) {
            System.out.println("The number " + target + " is found in the range.");
        } else {
            System.out.println("The number " + target + " is not found in the range.");
        }
    }
}