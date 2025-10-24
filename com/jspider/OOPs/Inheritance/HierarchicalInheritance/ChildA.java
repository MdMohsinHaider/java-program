package com.jspider.OOPs.Inheritance.HierarchicalInheritance;

public class ChildA extends Parent{
    String name = "ChildA";
    static String staticName = "Static ChildA name";

    public static void getStaticMethod(){
        System.out.println("ChildA static method");
    }

    public void getMethod(){
        System.out.println("ChildA non-static Method");
    }

    private void checkStatic(){
        // class references
        System.out.println(staticName);
        System.out.println(ChildA.staticName);
        System.out.println(Parent.staticName);
        getStaticMethod();
        ChildA.getStaticMethod();
        Parent.getStaticMethod();
    }

    private void getNonStatic(){
        ChildA childA = new ChildA();
        System.out.println(childA.name);
        System.out.println(super.name);
        getMethod();
        childA.getMethod();
        super.getMethod();

    }

    public static void main(String[] args) {
        ChildA childA = new ChildA();
//        childA.checkStatic();
        childA.getNonStatic();
    }
}
