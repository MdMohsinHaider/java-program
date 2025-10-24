package com.jspider.OOPs.Inheritance.HierarchicalInheritance;

public class Parent {
    String name = "Parent";
    static String staticName = "Static Parent name";

    public static void getStaticMethod(){
        System.out.println("Parent static method");
    }

    public void getMethod(){
        System.out.println("Parent non-static Method");
    }
}
