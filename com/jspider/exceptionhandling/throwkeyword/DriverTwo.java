package com.jspider.exceptionhandling.throwkeyword;

public class DriverTwo {
    public static void main(String[] args) {

        try {
            getDiv();
        } catch (OneDividedException e) {
            e.fillInStackTrace();
        }
    }

    private static void getDiv() throws OneDividedException {
        int a = 1;
        int b = 20;
        int c = a/b;
        int d = b/a;
        if (a==1 || b==1){
            throw new OneDividedException(" a not equal to 1 ");
        }
        System.out.println(c);
        System.out.println(d);
    }
}
