package com.jspider.javaprogram.src.collection;

import java.util.ArrayList;
import java.util.Collection;

public class PrintCollection {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>();

        collection.add(12);
        collection.add(34);
        collection.add(2);
        collection.add(8);
        collection.add(80);
        collection.add(13);
        System.out.println(collection);



    }
}
