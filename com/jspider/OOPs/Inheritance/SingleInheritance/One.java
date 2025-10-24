package com.jspider.OOPs.Inheritance.SingleInheritance;

public class One {
    String name = "One Class Variable";
    static String staticsName = "Static One Class Variable";

    public static void getStaticMethod(){
        System.out.println("One Class static Method");
    }

    public void getAdd(int a, int b){
        System.out.println("From One Class "+(a+b));
    }

    public void getMethod(){
        System.out.println("One Class Method");
    }

}
