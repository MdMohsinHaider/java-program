package com.jspider.OOPs.Inheritance.MultilevelInheritance;

public class Fruit extends Plant{

    String name = "fruit";
    static String staticName ="Static fruit";

    @Override
    public void getMethod(){
        System.out.println("Fruit Method");
    }

    public static void getStaticMethod(){
        System.out.println("Static Fruit Method");
    }
}
