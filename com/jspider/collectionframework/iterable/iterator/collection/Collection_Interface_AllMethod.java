package com.jspider.collectionframework.iterable.iterator.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collection_Interface_AllMethod implements Collection {
    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    // Main Method
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
