package com.jspider.collectionframework.iterable.iterator.collection;

import java.util.ArrayList;
import java.util.Collection;

public class ProgramCollection2 {
    public static void main(String[] args) {
        Collection c1 = new ArrayList();
        c1.add(23);
        c1.add(23.45);
        c1.add("Mohsin");
        c1.add('@');
        c1.add(34);
        System.out.println(c1.contains(346)); // return boolean --> false
        System.out.println(c1.contains(34));  // return boolean --> true
        System.out.println("c1 size : "+c1.size()); // return int --> 5
        System.out.println("c1 hashcode : "+c1.hashCode()); // return int --> -2061970230
    }
}
