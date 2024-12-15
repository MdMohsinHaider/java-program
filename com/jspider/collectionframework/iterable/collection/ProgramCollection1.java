package com.jspider.collectionframework.iterable.collection;

import java.util.ArrayList;
import java.util.Collection;

public class ProgramCollection1 {
    public static void main(String[] args) {
        Collection c1 = new ArrayList();
        Collection c2 = new ArrayList();
        System.out.println(c1+"\n"); // return empty []Array.
        c1.add(23);
        System.out.println(c1.add(34)+"\n"); // return boolean value.

        c1.add(23.45);
        c1.add("Mohsin");
        c1.add('@');
        System.out.println(c1+"\n"); // print [23, 34, 23.45, Mohsin, @] Array

        c1.add(44);
        c1.add(23);
        System.out.println(c1+"\n");

        c2.add(344);
        c2.add(200);
        c2.add(500);
        c2.add(450);
        System.out.println("c1 is : "+c1); // c1 is : [23, 34, 23.45, Mohsin, @, 44, 23]
        System.out.println("c2 is : "+c2+"\n"); // c2 is: [344, 200, 500, 450]

        c1.addAll(c2);
        System.out.println("Now C1 is : "+c1); // Now C1 is: [23, 34, 23.45, Mohsin, @, 44, 23, 344, 200, 500, 450]

        c1.remove(23);
        System.out.println("c1 remove is present in Collection :"+c1);
        c1.remove(1000);
        System.out.println("c1 remove not present in Collection :"+c1);
    }
}
