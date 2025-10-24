package com.jspider.CollectionFramework.Iterable.Iterator.collection.set.hashset;

import java.util.*;

public class HashSet_Program {
    /**
     * <p>HashSet Characteristics:</p>
     * <ul>
     *   <li>HashSet cannot contain duplicate values.</li>
     *   <li>HashSet allows a single null value.</li>
     *   <li>HashSet is an unordered collection; it does not maintain the insertion order of elements.</li>
     *   <li>HashSet internally uses a HashMap to store its elements.</li>
     *   <li>HashSet is not thread-safe. Concurrent modifications by multiple threads can lead to non-deterministic outcomes.</li>
     *   <li>Explicit synchronization is required to safely access a HashSet in a multi-threaded environment.</li>
     * </ul>
     */
    public static void main(String[] args) {
        HashSet_Program hs = new HashSet_Program();
//        hs.example0();
//        hs.example1();
//        hs.example2();
//        hs.example3();
//        hs.example4();
//        hs.example5();
        hs.example6();
    }


    /**
     * <h1>Example 0</h1>
     * <p>Set can contain one null value</p>
     */
    private void example0(){
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Apple");
        stringSet.add("Mango");
        stringSet.add("banana");
        stringSet.add("car");
        stringSet.add(null);
        stringSet.add("Mobile");
        stringSet.add("Phone");
        stringSet.add("Mohsin");
        System.out.println(stringSet);
        System.out.println(stringSet.contains(null)); // true
    }



    /**
     * <h1>Example 1</h1>
     * <p>HasSet does not contain duplicate elements</p>
     */
    private void example1(){
        Set<String> stringSet = new HashSet<>();
        stringSet.add("element1");
        stringSet.add("element2");
        stringSet.add("element1"); // not added this because of duplicate.
        System.out.println(stringSet);

    }





    /**
     * <h1>Example 2</h1>
     * <p>it is an unordered collection</p>
     */
    private void example2(){
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(23);
        integerSet.add(143);
        integerSet.add(13);
        integerSet.add(32);
        integerSet.add(476);

        System.out.println(integerSet);
    }




    /**
     * <h1>Example 3</h1>
     * <p>Create a HashSet using the HashSet constructor
     * add new to using</p>
     * Method : <code>add(Object o)</code>
     */
    private void example3(){
        Set<String> stringSet = new HashSet<>();
        stringSet.add("C");
        stringSet.add("C++");
        stringSet.add("Java");
        stringSet.add("python");
        stringSet.add("Scala");
        stringSet.add("JavaScript");

        System.out.println(stringSet);
        stringSet.add("Java");
        System.out.println(stringSet);
    }




    /**
     * <h1>Example 4</h1>
     * <p>Create a HashSet from another collection using the HashSet (Collection c) constructor.</p>
     * Constructor argument : <code>new Hashset(Collection c)</code>
     * <p>Add all the elements from a collection to the HashSet using the addAll() method.</p>
     * Method : <code>addAll(Collection c)</code>
     */
    private void example4(){

        List<Integer> firstFiveEvenNumber = new ArrayList<>(); // ✔️✔️
//        Set<Integer> firstFiveEvenNumber = new HashSet<>(); // ✔️✔️
        firstFiveEvenNumber.add(2);
        firstFiveEvenNumber.add(4);
        firstFiveEvenNumber.add(6);
        firstFiveEvenNumber.add(8);
        firstFiveEvenNumber.add(10);

        Set<Integer> tenEvenNumber = new HashSet<>(firstFiveEvenNumber);
        System.out.println(tenEvenNumber);

//        List<Integer> nextFiveEvenNumber = new ArrayList<>(); // ✔️✔️
        Set<Integer> nextFiveEvenNumber = new HashSet<>(); // ✔️✔️
        nextFiveEvenNumber.add(12);
        nextFiveEvenNumber.add(14);
        nextFiveEvenNumber.add(16);
        nextFiveEvenNumber.add(18);
        nextFiveEvenNumber.add(20);

        tenEvenNumber.addAll(nextFiveEvenNumber);
        System.out.println(tenEvenNumber);
    }



    /**
     * <h1>Example 5</h1>
     * <p>1. Remove an element from a HashSet using </p>
     * Method : <code>remove()</code>
     * <p>2. It takes a Predicate (a functional interface representing a condition) as an argument</p>
     * <p> lambda expression that defines the condition</p>
     * Method : <code>removeIf(lambda expression)</code>
     * <p>3. Remove all the elements that exist in a given collection from the HashSet.</p>
     * Method : <code>removeAll(Collection c)</code>
     * <p>4. Clear the HashSet completely by removing all the elements.</p>
     * Method : <code>clear()</code>
     */
    private void example5(){
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(12);
        integerSet.add(34);
        integerSet.add(13);
        integerSet.add(98);
        integerSet.add(45);
        integerSet.add(39);
        integerSet.add(79);
        integerSet.add(42);

        // 1.
//        System.out.println(integerSet);
//        boolean a = integerSet.remove(98);
//        System.out.println(a+" "+integerSet);

        // 2.
//        integerSet.removeIf(num->num < 30);
//        System.out.println(integerSet);

        // 3.
        Set<Integer> removeEven = new HashSet<>();
        removeEven.add(12);
        removeEven.add(34);
        removeEven.add(42);
        removeEven.add(98);
        boolean b = integerSet.removeAll(removeEven);
        System.out.println(b+" "+integerSet);

        // 4.
        integerSet.clear();
        System.out.println(integerSet);
    }

    /**
     * <h1>Example 6: Iterating through a HashSet</h1>
     * <p>This example demonstrates five different ways to retrieve elements from a HashSet:</p>
     *
     * <ol>
     *     <li><b>Enhanced for loop:</b></li>
     *     <pre>{@code
     *     for (dataType a : collection) {
     *         System.out.println(a);
     *     }
     *     }</pre>
     *
     *     <li><b>Basic loop with Iterator:</b></li>
     *     <pre>{@code
     *     for (Iterator<T> Iterator = collection.Iterator(); Iterator.hasNext();) {
     *         System.out.println(Iterator.next());
     *     }
     *     }</pre>
     *
     *     <li><b>While loop with Iterator:</b></li>
     *     <pre>{@code
     *     Iterator<String> Iterator = collection.Iterator();
     *     while (Iterator.hasNext()) {
     *         System.out.print(Iterator.next() + " ");
     *     }
     *     }</pre>
     *
     *     <li><b>JDK 8 forEach() method with lambda:</b></li>
     *     <pre>{@code
     *     collection.forEach(a -> System.out.print(a + " "));
     *     }</pre>
     *
     *     <li><b>JDK 8 Stream API with forEach() and filter:</b></li>
     *     <pre>{@code
     *     fruitSet.stream()
     *             .filter(a -> !"java".equals(a))
     *             .forEach(System.out::println);
     *     }</pre>
     * </ol>
     */

    private void example6(){
        Set<String> fruitSet = new HashSet<>();
        fruitSet.add("Apple");
        fruitSet.add("Banana");
        fruitSet.add("Chilly");
        fruitSet.add("Diamond");
        fruitSet.add("Eggs");
        fruitSet.add("Fig");
        fruitSet.add("Grapes");
        fruitSet.add("Honeydew");
        fruitSet.add("Iceberg");
        fruitSet.add("Jack fruit");

        // 1.
        for (String fruit : fruitSet)
            System.out.print(fruit+" ");

        System.out.println("\n");

        // 2.
        for (Iterator<String> iterator = fruitSet.iterator(); iterator.hasNext() ;)
            System.out.print(iterator.next()+" ");

        System.out.println("\n");

        // 3.
        Iterator<String> iterator = fruitSet.iterator();
        while (iterator.hasNext())
            System.out.print(iterator.next()+" ");

        System.out.println("\n");

        // 4.
//        fruitSet.forEach(System.out::println);
        fruitSet.forEach(fruit -> System.out.print(fruit+" "));

        System.out.println("\n");

        // 5.
        fruitSet.stream().filter(a-> !"java".equals(a))
//                .forEach(System.out::println);
                .forEach(a-> System.out.print(a+" "));

    }
}
