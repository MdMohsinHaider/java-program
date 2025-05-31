package com.jspider.OOPs.Inheritance.SingleInheritance;

public class Driver {
    public static void main(String[] args) {
        One one = new One();
        Two two = new Two();

//        // One Class
//        System.out.println("........................ One Class .........................");
//        System.out.println(one.name);
//        System.out.println(One.staticsName);
//        one.getAdd(2,4);
//        one.getOneMethod();
//        One.getOneStaticMethod();

        // Two Class
        System.out.println("........................ Two Class .........................");
        System.out.println(two.name); // parent class name variable hide due to same name variable
        two.getAdd(3,7);
        two.getOneMethod();

    }
}
