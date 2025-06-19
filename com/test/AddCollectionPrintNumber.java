package com.test;

import java.util.ArrayList;
import java.util.Collection;

public class AddColletionPrintNumber {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("123");
        collection.add("H");
        collection.add("hello");
        System.out.println(collection);

        for (String string : collection){
            if (string.matches("\\d+")){
                System.out.println(string);
            }
        }

        for (String item : collection) {
            if (item.matches("\\d+")) { // checks if the item contains only digits
                System.out.println(item);
            }
        }

    }
}
