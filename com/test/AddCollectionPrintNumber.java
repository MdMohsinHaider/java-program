package com.test;

import java.util.ArrayList;
import java.util.Collection;

public class AddCollectionPrintNumber {
    public static void main(String[] args) {
        withOutObjectUsed();
        withObjectUsed();
    }

    private static void withOutObjectUsed(){
        Collection<String> collection = new ArrayList<>();
        collection.add("123");
        collection.add("H");
        collection.add("hello");

        for (String string : collection){
            if (string.matches("\\d+")){
                System.out.println(string);
            }
        }
    }

    private static void withObjectUsed(){
        Collection<Object> collection = new ArrayList<>();
        collection.add(123);
        collection.add('H');
        collection.add("Hello");

        for (Object object: collection){
            if (object instanceof Integer){
                System.out.println(object);
            }
        }

    }
}

