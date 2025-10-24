package com.jspider.OOPs.InnerClasses.MemberInnerClass;

public class Test {
    public static void main(String[] args) {
        Car car = new Car("Tata safari");
        Car.Engin engin = car.new Engin();
        engin.start();
        engin.stop();

        Car car1 = new Car("Alto 800");
        Car.Engin engin1 = car1.new Engin();
        engin1.start();
        engin1.start();

        System.out.println(engin.hashCode());
        System.out.println(engin1.hashCode());

        System.out.println(engin);
        System.out.println(engin1);
    }
}
