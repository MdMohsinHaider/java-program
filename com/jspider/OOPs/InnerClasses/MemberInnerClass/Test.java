package com.jspider.OOPs.InnerClasses.MemberInnerClass;

public class Test {
    public static void main(String[] args) {
        Car car = new Car("Tata safari");
        Car.Engin engin = car.new Engin();
        engin.start();
        engin.start();
        engin.stop();
        engin.start();
    }
}
