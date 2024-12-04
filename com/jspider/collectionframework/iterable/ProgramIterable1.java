package com.jspider.collectionframework.iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProgramIterable1 {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Using Iterable with for-each
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Using Iterator directly
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
