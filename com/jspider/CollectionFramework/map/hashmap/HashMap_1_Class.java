package com.jspider.CollectionFramework.map.hashmap;

import java.util.*;

/**
 * <h1>Java HashMap Overview</h1>
 *
 * <h2>Introduction:</h2>
 * <ul>
 *   <li>Java HashMap is a hash table-based implementation of Java's Map interface.</li>
 *   <li>Provides an efficient way to store and retrieve data as key-value pairs.</li>
 *   <li>Commonly used collection in Java due to its performance and flexibility.</li>
 * </ul>
 *
 * <h2>Key Features:</h2>
 * <ul>
 *   <li><b>Duplicate Keys:</b> A HashMap cannot contain duplicate keys. Each key in the map is unique.</li>
 *   <li><b>Null Values and Key:</b> Allows null values and a single null key.</li>
 *   <li><b>Unordered Collection:</b> Does not guarantee any specific order of the elements.</li>
 *   <li><b>Thread Safety:</b> Not thread-safe; explicit synchronization is required for concurrent modifications.</li>
 * </ul>
 *
 * <h2>Usage:</h2>
 * <ul>
 *   <li>Useful for associating keys with values for fast retrieval.</li>
 *   <li>Examples include caching, lookups, and maintaining unique records.</li>
 * </ul>
 */

public class HashMap_1_Class {

    /**
     * <h1>Main method</h1>
     * The entry point of the Java application.
     *
     * @param args Command-line arguments passed to the program.
     */
    public static void main(String[] args) {
        HashMap_1_Class hc = new HashMap_1_Class();

//        hc.example0();
//        hc.example1();
//        hc.example2();
        hc.example3();
    }

    /**
     * <h1>Example 0</h1>
     * <p>How to create HashMap and element add by using</p>
     * Method <code>put(Key, value)</code>
     */
    private void example0(){
        Map<String,Integer> map = new HashMap<>();
        map.put("one",1);
        map.put("two",2);
        map.put("three",3);
        map.put("four",4);
        map.put("six",6);

        System.out.println(map);
        map.put(null,6);
        map.put(null,7); // replace only value or update value
        System.out.println(map);
    }


    /**
     * <h1>Example 1</h1>
     * <h2>Methods in HashMap</h2>
     * <p>1. Check a HashMap is empty</p>
     * Method : <code>isEmpty()</code>
     * <p>2. Find the size of a HashMap</p>
     * Method : <code>size()</code>
     * <p>3. Check if a key exists in the HashMap</p>
     * Method : <code>containsKey(Object key)</code>
     * <p>4. Check if a value exists in the HashMap</p>
     * Method : <code>containsValue(Object value)</code>
     * <p>5. Get the value in the HashMap by using key Object </p>
     * Method : <code>get(Object key)</code>
     * <p>6. get Array of all the value in the HashMap by using </p>
     * Method : <code>values()</code>
     * <p>7. Remove a Key value pair with the help of Object key in the HashMap</p>
     * Method : <code>remove(Object key)</code>
     * <p>8. Remove a key value pair when both are match in the HashMap</p>
     * Method : <code>remove(Object key, Object value)</code>
     * <p>9. Get all the keys in the HashMap</p>
     * Method : <code>keySet()</code>
     */
    private void example1(){
        Map<String,Integer> map = new HashMap<>();
        map.put("one",1);
        map.put("two",2);
        map.put("three",3);
        map.put("four",4);
        map.put("six",6);
        map.put("seven",7);
        map.put("eight",8);
        map.put("nine",9);
        map.put("ten",10);

        System.out.println(map.isEmpty()); // false


        System.out.println(map.size()); // 5


        if (map.containsKey("two"))
            System.out.println("Key Exists");
        else
            System.out.println("key not exits");


        if (map.containsValue(9))
            System.out.println("value Exists");
        else
            System.out.println("value not exits");

        Integer v1 = map.get("four");
        System.out.println(v1);

        Collection<Integer> values = map.values();
        System.out.println(values);

        System.out.println("removed : "+map.remove("four"));

        System.out.println("removed if pair match : "+map.remove("five",7));

        Set<String> keys = map.keySet();
        System.out.println(keys);

    }

    /**
     * <h1>Example 2</h1>
     * <h2>How to iterate over HashMap</h2>
     * <p>1. Get all key and value by For each method </p>
     * Method : <code> Map.Entry <Object o,Object v> entry : collection.entrySet()</code>
     * <li><code>getKey()</code></li>
     * <li><code>getValue()</code></li>
     * <p>2. Get all key and value by Iterator method</p>
     * Method : <code>Iterator()</code>
     * <p>3. Get all key and value by forEach java 8</p>
     * Method : <code>forEach((k,v)->{})</code>
     */
    private void example2(){
        Map<String,Integer> map = new HashMap<>();
        map.put("one",1);
        map.put("two",2);
        map.put("three",3);
        map.put("four",4);
        map.put("six",6);
        map.put("seven",7);
        map.put("eight",8);
        map.put("nine",9);
        map.put("ten",10);

        for (Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println("key : "+entry.getKey() +" value : "+entry.getValue());
        }

        System.out.println("\n");

//        Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
//        Iterator<Map.Entry<String,Integer>>  entryIterator= entrySet.Iterator();
//        while (entryIterator.hasNext()){
//            System.out.println(entryIterator.next());
//        }
//
//        System.out.println("\n");

        Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
        Iterator <Map.Entry<String,Integer>> iterator = entrySet.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());


        System.out.println("\n");


        map.forEach((k,v)->{
            System.out.println("Key : " + k+" Value : "+v);
        });
    }


    /**
     * <h1>Example 3</h1>
     * <h2>Student Non-Primitive datatype in HashMap</h2>
     * <p>How to add and get data from HashMap</p>
     * <li>Method : <code>put(Object k, new Student() )</code></li>
     */
    private void example3(){
        Map<Integer,Student> studentMap = new HashMap<>();

        studentMap.put(1,new Student("Md Mohsin","Haider"));
        studentMap.put(2,new Student("Tony","Stark"));
        studentMap.put(3,new Student("Mohan","shing"));
        studentMap.put(4,new Student("Sohan"));
        studentMap.put(5,new Student("Devil"));

        System.out.println(studentMap);

        studentMap.forEach((k,v)-> System.out.println(k+" = "+v));

        System.out.println(studentMap.keySet() +"\n"+studentMap.values());


    }

}
