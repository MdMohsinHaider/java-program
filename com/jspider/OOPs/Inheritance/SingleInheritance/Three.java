package com.jspider.OOPs.Inheritance.SingleInheritance;

public class Three extends Two {
    String name = "Three Class Variable";
    static String staticsName = "Static Three Class Variable";

    @Override
    public void getAdd(int e, int f){
        System.out.println("From Three Class "+(e+f));
    }

    public void getThreeMethod(){
        System.out.println("Three Class Method");
    }

    public static void getThreeStaticMethod(){
        System.out.println("Three Class static Method");
    }
}
