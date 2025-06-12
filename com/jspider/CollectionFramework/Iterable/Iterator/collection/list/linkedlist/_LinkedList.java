package com.jspider.CollectionFramework.Iterable.Iterator.collection.list.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class _LinkedList {
    /**
     * This class provides an overview of the key features of the Java LinkedList class:
     *
     * <ul>
     *   <li>Java LinkedList class can contain duplicate elements.</li>
     *   <li>Java LinkedList class maintains the insertion order of elements.</li>
     *   <li>The LinkedList class implements the Queue and Deque interfaces:
     *       <ul>
     *           <li>It can be used as a Queue.</li>
     *           <li>It can be used as a Deque.</li>
     *           <li>It can also be used as a Stack.</li>
     *       </ul>
     *   </li>
     *   <li>Java LinkedList is not thread-safe:
     *       <ul>
     *           <li>Concurrent modifications in a multi-threaded environment must be explicitly synchronized.</li>
     *       </ul>
     *   </li>
     * </ul>
     */

    public static void main(String[] args) {
        _LinkedList lc = new _LinkedList();
//        lc.example0();
//        lc.example1();
//        lc.example2();
//        lc.example3();
//        lc.example4();
//        lc.example5();
//        lc.example6();
//        lc.example7();
//        lc.example8();
//        lc.example9();
        lc.example10();
    }


    /**
     * <h1>Example 0<h1/>
     */
    private void example0(){
        List<String> list = new LinkedList<>();
        list.add(null);
        list.add(null);
        System.out.println(list.size());
    }




    /**
     * <h1>Example 1</h1>
     * <p>create LinedList and added element by using </p>
     * <code>add()</code>
     */
    private void example1(){
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Chilly");
        linkedList.add("Diamond");
        linkedList.add("Eggs");
        linkedList.add("Fig");
        linkedList.add("Grapes");
        linkedList.add("Honeydew");
        linkedList.add("Iceberg");
        linkedList.add("Jack fruit");
        linkedList.forEach(System.out::println);
        System.out.println(linkedList.size());
        System.out.println("at Index 3 "+linkedList.get(3));
    }



    /**
     * <h1>Example 2</h1>
     * <p>create LinedList and added element by using </p>
     * <code>add(index, element)</code>
     */
    private void example2(){
        List<String> linkedlist = new LinkedList<>();
        linkedlist.add("Apple");
        linkedlist.add("Banana");
        linkedlist.add("Chilly");
        linkedlist.add("Diamond");
        linkedlist.add("Eggs");
        linkedlist.add("Fig");
        linkedlist.add("Grapes");
        linkedlist.add("Honeydew");
        linkedlist.add("Iceberg");
        linkedlist.add("Jack fruit");
        linkedlist.add(5,"Car");
        linkedlist.add(6,"Bus");

        System.out.println(linkedlist); // [Apple, Banana, chilly, diamond, Eggs, Car, Bus]

        linkedlist.add(2,"___Camera");
        linkedlist.forEach(System.out::println);
    }





    /**
     * <h1>Example 3</h1>
     * <p>This method comes from Deque Interface</p>
     * <p>create LinedList and added element by using </p>
     * <code>addFirst()</code>
     */
    private void example3(){
        List<String> linkedlist = new LinkedList<>();
        linkedlist.add("Apple");
        linkedlist.add("Banana");
        linkedlist.add("Chilly");
        linkedlist.add("Diamond");
        linkedlist.add("Eggs");
        linkedlist.add("Fig");
        linkedlist.add("Grapes");
        linkedlist.add("Honeydew");
        linkedlist.add("Iceberg");
        linkedlist.add("Jack fruit");

        linkedlist.addFirst("Car");

        System.out.println(linkedlist); // [Car, Apple, Banana, chilly, diamond, Eggs]

        linkedlist.forEach(System.out::println);
    }





    /**
     * <h1>Example 4</h1>
     * <p>This method comes from Deque Interface</p>
     * <p>create LinedList and added element by using </p>
     * Method : <code>addLast()</code>
     */
    private void example4(){
        List<String> linkedlist = new LinkedList<>();
        linkedlist.add("Apple");
        linkedlist.add("Banana");
        linkedlist.add("Chilly");
        linkedlist.add("Diamond");
        linkedlist.add("Eggs");
        linkedlist.add("Fig");
        linkedlist.add("Grapes");
        linkedlist.add("Honeydew");
        linkedlist.add("Iceberg");
        linkedlist.add("Jack fruit");

        linkedlist.addLast("Car");

        System.out.println(linkedlist); // [Car, Apple, Banana, chilly, diamond, Eggs]

        linkedlist.forEach(System.out::println);
    }




    /**
     * <h1>Example 5</h1>
     * <p>How to get the first element •n the LinkedList. </p>
     * Method : <code>getFirst()</code>
     */
    private void example5(){
        List<String> linkedlist = new LinkedList<>();
        linkedlist.add("Apple");
        linkedlist.add("Banana");
        linkedlist.add("Chilly");
        linkedlist.add("Diamond");
        linkedlist.add("Eggs");
        linkedlist.add("Fig");
        linkedlist.add("Grapes");
        linkedlist.add("Honeydew");
        linkedlist.add("Iceberg");
        linkedlist.add("Jack fruit");

        System.out.println(linkedlist.getFirst());
    }






    /**
     * <h1>Example 6</h1>
     * <p>How to get the last element •n the LinkedList. </p>
     * Method : <code>getLast()</code>
     */
    private void example6(){
        List<String> linkedlist = new LinkedList<>();
        linkedlist.add("Apple");
        linkedlist.add("Banana");
        linkedlist.add("Chilly");
        linkedlist.add("Diamond");
        linkedlist.add("Eggs");
        linkedlist.add("Fig");
        linkedlist.add("Grapes");
        linkedlist.add("Honeydew");
        linkedlist.add("Iceberg");
        linkedlist.add("Jack fruit");

        System.out.println(linkedlist.getLast());
    }




    /**
     * <h1>Example 7</h1>
     * <p>How to get the element at the given index in the LinkedList. </p>
     * Method : <code>get(Integer index_number)</code>
     */
    private void example7(){
        List<String> linkedlist = new LinkedList<>();
        linkedlist.add("Apple");
        linkedlist.add("Banana");
        linkedlist.add("Chilly");
        linkedlist.add("Diamond");
        linkedlist.add("Eggs");
        linkedlist.add("Fig");
        linkedlist.add("Grapes");
        linkedlist.add("Honeydew");
        linkedlist.add("Iceberg");
        linkedlist.add("Jack fruit");

        System.out.println(linkedlist.get(3));
    }





    /**
     * <h1>Example 8</h1>
     * <p> How to get all the elements from LinkedList </p>
     * <code>addLast()</code>
     */
    private void example8(){
        List<String> linkedlist = new LinkedList<>();
        linkedlist.add("Apple");
        linkedlist.add("Banana");
        linkedlist.add("Chilly");
        linkedlist.add("Diamond");
        linkedlist.add("Eggs");
        linkedlist.add("Fig");
        linkedlist.add("Grapes");
        linkedlist.add("Honeydew");
        linkedlist.add("Iceberg");
        linkedlist.add("Jack fruit");
        // 1. way
        for (int i = 0; i < linkedlist.size(); i++)
            System.out.print(linkedlist.get(i)+" ");

        System.out.println("\n");

        // 2. way
        Iterator<String> iterator = linkedlist.iterator();
        while (iterator.hasNext())
            System.out.print(iterator.next()+" ");

        System.out.println("\n");

        // 3. way
        Iterator<String> iterator1 = linkedlist.iterator();
        for (; iterator1.hasNext();)
            System.out.print(iterator1.next()+" ");

        System.out.println("\n");

        // 4. way
        for (String element:linkedlist)
            System.out.print(element+" ");

        System.out.println("\n");

        // 5. way
        linkedlist.forEach(System.out::println);

        System.out.println("\n");

        // 6. way
        linkedlist.forEach(element -> System.out.print(element + " "));

        System.out.println("\n");

        // 7. way
        System.out.println(String.join(" ", linkedlist));
    }

    /**
     * <h1>Example 9</h1>
     * <p>How to remove the first element in the LinkedList.</p>
     * Method : <code>removeFirst()</code>
     *
     * <p>How to remove the last element in the LinkedList.</p>
     * Method : <code>removeLast()</code>
     *
     * <p>How to remove the first occurrence of a given element in the LinkedList.</p>
     * Method : <code>remove(Object o)</code>
     *
     * <p>How to clear the LinkedList completely.</p>
     * Method : <code>remove()</code>
     */
    private void example9(){
        List<String> linkedlist = new LinkedList<>();
        linkedlist.add("Apple");
        linkedlist.add("Banana");
        linkedlist.add("Chilly");
        linkedlist.add("Diamond");
        linkedlist.add("Eggs");
        linkedlist.add("Fig");
        linkedlist.add("Grapes");
        linkedlist.add("Honeydew");
        linkedlist.add("Iceberg");
        linkedlist.add("Jack fruit");

        System.out.println(linkedlist);

        System.out.println("\nremoved element is : "+linkedlist.removeFirst());
        System.out.println(linkedlist);

        System.out.println("\nremoved element is : "+linkedlist.removeLast());
        System.out.println(linkedlist);

        System.out.println("\nremoved element is : "+linkedlist.remove("Fig"));
        System.out.println(linkedlist);

        linkedlist.clear();
        System.out.println("After clear() method clear object : "+linkedlist);

    }

    /**
     * <h1>Example 10</h1>
     * <p> How-to the elements in contain or not from LinkedList </p>
     *  Method : <code>contains(Object o)</code>
     *
     * <p>Find the index of the first occurrence of an element in the LinkedList</p>
     *  Method : <code>indexOf(Object o)</code>
     *
     *  <p>Find the index of the last occurrence of an element in the LinkedList</p>
     *   Method : <code>lastIndexOf(Object o)</code>
     */
    private void example10(){
        List<String> linkedlist = new LinkedList<>();
        linkedlist.add("Apple");
        linkedlist.add("Banana");
        linkedlist.add("Chilly");
        linkedlist.add("Diamond");
        linkedlist.add("Eggs");
        linkedlist.add("Fig");
        linkedlist.add("Grapes");
        linkedlist.add("Honeydew");
        linkedlist.add("Eggs");
        linkedlist.add("Iceberg");
        linkedlist.add("Eggs");
        linkedlist.add("Jack fruit");

        boolean b = linkedlist.contains("Fig");
        System.out.println(b); // return true

        int index = linkedlist.indexOf("Eggs");
        System.out.println("Index : "+index);

        int lastIndex = linkedlist.lastIndexOf("Eggs");
        System.out.println(lastIndex);
    }
}
