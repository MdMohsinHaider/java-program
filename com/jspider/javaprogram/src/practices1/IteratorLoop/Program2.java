package com.jspider.javaprogram.src.practices1.IteratorLoop;


/*
*
*   Design a method which will accept a collection and will remove all string type elements from the collection.
*
* */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Program2 {
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
        removeAllString(c1);
    }

    public static void removeAllString(Collection c){
        System.out.print("Before : "+c);
        Iterator itr = c.iterator();
        while (itr.hasNext()){
            Object o = itr.next();
            if (o instanceof String){
                itr.remove();
            }
        }
        System.out.print("\nAfter : "+c);
    }
}
