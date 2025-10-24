package com.jspider.CollectionFramework.Iterable.Iterator.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Program_1_Collection {
    public static void main(String[] args) {
        Collection<String> fruitCollection = new ArrayList<>();
        fruitCollection.add("Banana");
        fruitCollection.add("apple");
        fruitCollection.add("Mango");
        System.out.println(fruitCollection);

        fruitCollection.remove("Banana");
        System.out.println(fruitCollection);

        System.out.println(fruitCollection.contains("Banana"));

        fruitCollection.forEach(System.out::println);

        System.out.println(fruitCollection.size());
    }
}
