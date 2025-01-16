package com.jspider.javaprogram.src.practices.Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Program8 {
    public static void main(String[] args) {
        getNotStrogeNumber();
    }

    public static void getNotStrogeNumber(){
        Collection c1 = new ArrayList();
        c1.add(12);
        c1.add(13);
        c1.add(56);
        c1.add(98);
        c1.add(145);
        c1.add(23);
        c1.add(45);
        c1.add(44);
        c1.add(200);
        c1.add(700);
        c1.add(13);
        System.out.println(c1);

        Iterator itr = c1.iterator();
        while (itr.hasNext()){
            int x = (int)itr.next();
            if (isStrongNumber(x)) itr.remove();
        }
        System.out.println(c1);
    }

    public static boolean isStrongNumber(int number) {
        int originalNumber = number;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += factorial(digit);  // Add factorial of the digit to sum
            number /= 10;
        }
        return sum == originalNumber;  // Compare a sum with the original number
    }


    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
