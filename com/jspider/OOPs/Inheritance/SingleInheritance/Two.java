package com.jspider.OOPs.Inheritance.SingleInheritance;

public class Two extends One {
    String name = "Two Class Variable";
    static String staticsName = "Static Two Class Variable";

    public static void getStaticMethod(){
        System.out.println("Two Class static Method");
    }

    @Override
    public void getAdd(int a, int b){
        System.out.println("From Two Class "+(a+b));
    }

    public void getMethod(){
        System.out.println("Two Class Method");
    }

    // Main Method
    public static void main(String[] args) {

        // static
//        System.out.println(staticsName);
//        System.out.println(One.staticsName);
//        getStaticMethod();
//        One.getStaticMethod();

        // non-static
        Two two = new Two();
        System.out.println(two.name);
        System.out.println(); // One Class name variable is hidden
        two.getAdd(12,34); // override one class method getAdd(int a, int b)
        two.getMethod(); // override one class method getMethod()
    }
}
