package com.jspider.javaprogram.src.practices.IteratorLoop;

/*
*
*   Design a method which will remove all the elements from a collection which are not an integer.
*
* */


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Program5 {
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
        otherThanInteger(c1);
    }

    public static void otherThanInteger(Collection c){
        System.out.print("Before : "+c);
        Iterator itr = c.iterator();
        while (itr.hasNext()){
            Object o = itr.next();
            if (!(o instanceof Integer)){
                itr.remove();
            }
        }
        System.out.print("\nAfter : "+c);
    }
}
