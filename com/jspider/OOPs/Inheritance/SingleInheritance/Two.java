package com.jspider.OOPs.Inheritance.SingleInheritance;

public class Two extends One {
    String name = "Two Class Variable";
    static String staticsName = "Static Two Class Variable";

    @Override
    public void getAdd(int c, int d){
        System.out.println("From Two Class "+(c+d));
    }

    public void getTwoMethod(){
        System.out.println("Two Class Method");
    }

    public static void getStaticMethod(){
        System.out.println("Two Class static Method");
    }
}
