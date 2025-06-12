package com.jspider.CollectionFramework.Iterable.Iterator.collection.list;

import java.util.ArrayList;
import java.util.List;

public class Program_1_List {

    // main method
    public static void main(String[] args) {
        Program_1_List list = new Program_1_List();
        list.Example1();
        list.Example2();
        list.Example3();
        list.Example4();
    }


    /**
     * Example 1
     * List allows you to add duplicate elements.
     */
    private  void Example1(){
        List<String> list = new ArrayList<>();
        list.add("element 1");
        list.add("element 1");
        list.add("element 2");
        list.add("element 2");
        System.out.println(list);
    }

    /**
     * Example 2
     * List allows you to have •null ' elements.
     */
    private void Example2(){
        List<String> list = new ArrayList<>();
        list.add(null);
        list.add(null);
        System.out.println(list);
    }

    /**
     * Example 3
     * List insertion order will be the same as you insert element
     */
    private void Example3(){
        List<String> list = new ArrayList<>();
        list.add("element 1");
        list.add("element 2");
        list.add("element 3");
        list.add("element 4");
        list.add("element 5");
        list.add("element 6");
        list.add("element 7");
        list.add("element 8");
        list.add("element 9");
        System.out.println(list);
    }

    /**
     * Example 4
     * Access elements from List interface.
     *  List has Index
     */
    private void Example4(){
        List<String> list = new ArrayList<>();
        list.add("element 1");
        list.add("element 2");
        list.add("element 3");
        list.add("element 4");
        list.add("element 5");
        System.out.println(list.getFirst()); // index Zero
        System.out.println(list.get(3));
        System.out.println(list.getLast()); // index last
    }
}
