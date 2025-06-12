package com.jspider.CollectionFramework.Iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Program_1_Iterable {
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
