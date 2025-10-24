package com.jspider.javaprogram.src.practices1.Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Program4 {
    public static void main(String[] args) {
        getNonPrimeNumber();
    }

    public static void getNonPrimeNumber(){
        Collection c1 = new ArrayList();
        c1.add(12);
        c1.add(13);
        c1.add(56);
        c1.add(98);
        c1.add(89);
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
            if (isPrime(x)) itr.remove();
        }
        System.out.println(c1);

    }

    // check number is prime or not
    public static boolean isPrime(int x) {
        if (x <= 1) return false;
        for (int i = 2; i <= Math.sqrt(x); i++)
            if (x % i == 0) return false;
        return true;
    }
}
