package com.jspider.collectionframework.map.sortedmap.navigablemap.treemap;

import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListMap;

public class TreeMap_Class {
    public static void main(String[] args) {
        NavigableMap<Integer,String> navigableMap = new ConcurrentSkipListMap<>();
        navigableMap.put(3,"Banana");
        navigableMap.put(1,"Apple");
        navigableMap.put(2,"Mango");
        navigableMap.put(5,"Bike");
        navigableMap.put(4,"Car");

        System.out.println(navigableMap.descendingMap());

        navigableMap.forEach((k,v)-> System.out.println(k+"\n"+v));

        System.out.println("\n");

        Set<Map.Entry<Integer,String>> entrySet = navigableMap.entrySet();
        Iterator<Map.Entry<Integer,String>> iterator = entrySet.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}
