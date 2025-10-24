package com.jspider.OOPs.Inheritance.SingleInheritance;

public class Two extends One {
    // case 1
    String name = "Two Class Variable";
    // case 2
    static String staticsName = "Static Two Class Variable";
    // case 3
    public static void getStaticMethod(){
        System.out.println("Two Class static Method");
    }
    // case 4
    // non-static methods so it is overridden by default
    @Override
    public void getAdd(int a, int b){
        System.out.println("From Two Class "+(a+b));
    }
    // case 5
    @Override
    public void getMethod(){
        System.out.println("Two Class Method");
    }

    // 🏳️ ===========================================================================
    private void checkStatic(){
        // case 2
        System.out.println(staticsName); // child
        System.out.println(One.staticsName); // parent class

        // case 3
        getStaticMethod(); // child
        One.getStaticMethod(); // parent class
    }

    private void checkNonStatic(){
        // non-static
        Two two = new Two();
        // case 1
        System.out.println(two.name); // child
        System.out.println(super.name); // One Class name variable is hidden when call in static method

        two.getAdd(12,34); // override one class method getAdd(int a, int b)
        two.getMethod(); // override one class method getMethod()

        super.getAdd(12,8);
        super.getMethod(); // method call by using super key word from parent (must be callable method be non-static)
    }

    // Main Method
    public static void main(String[] args) {
        Two two = new Two();
//        two.checkStatic();
        two.checkNonStatic();
    }
}
