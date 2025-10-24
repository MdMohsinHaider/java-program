package com.jspider.OOPs.Inheritance.MultilevelInheritance;

public class Apple extends Fruit{
    // case 1
    String name = "Apple";
    // case 2
    static String staticName ="Static Apple";

    // case 3
    @Override
    public void getMethod(){
        System.out.println("Apple Method");
    }

    // case 4
    public static void getStaticMethod(){
        System.out.println("Static Apple Method");
    }

    // 🏳️ =================================================================================

    private void checkStatic(){
        // class reference
        System.out.println(staticName);
        System.out.println(Fruit.staticName);
        System.out.println(Plant.staticName);
        getStaticMethod(); // without class ref so current class assess
        Apple.getStaticMethod();
        Fruit.getStaticMethod();
        Plant.getStaticMethod();

    }
    private void checkNonStatic(){
        Apple apple = new Apple();
        System.out.println(apple.name);
        System.out.println(super.name);
        System.out.println("Plant class non-static variable not access");

        getMethod(); // current child class
        super.getMethod(); // immediate parent class
    }

    public static void main(String[] args) {
        Apple apple = new Apple();
//        apple.checkStatic();
        apple.checkNonStatic();
    }
}
