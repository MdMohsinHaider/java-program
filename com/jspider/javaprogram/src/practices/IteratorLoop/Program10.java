package com.jspider.javaprogram.src.practices.IteratorLoop;

/*
*
*
*   Design a method which will print the biggest and Smallest integer number from a collection.
*
* */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Program10 {
    public static void main(String[] args) {
        Collection c1 = new ArrayList();
        c1.add(23);
        c1.add(45.6);
        c1.add("Mohan");
        c1.add(45);
        c1.add(44.77);
        c1.add("Sohan");
        c1.add(44);
        c1.add(57);
        c1.add(100);
        c1.add(55);
        c1.add(200);
        c1.add(45.8);
        c1.add("John");
        getSmallBig(c1);
    }

    public static void getSmallBig(Collection c){
        int small = Integer.MAX_VALUE;
        int big = Integer.MIN_VALUE;

        Iterator itr = c.iterator();
        while (itr.hasNext()){
            Object o = itr.next();
            System.out.println(o);
            if (o instanceof Integer && small > (Integer) o){
                small = (Integer) o;
            }
            if (o instanceof Integer && big < (Integer) o){
                big = (Integer) o;
            }
        }
        System.out.println("Small number is : "+ small+" Biggest Number is :"+big);
    }
}
