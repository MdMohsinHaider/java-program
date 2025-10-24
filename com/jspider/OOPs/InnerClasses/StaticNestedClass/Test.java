package com.jspider.OOPs.InnerClasses.StaticNestedClass;

public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer("HP", "14s dq2535tu","Window 11");
        computer.getOs().displayInfo();

        Computer.USB usb = new Computer.USB("C");
        Computer.USB usb1 = new Computer.USB("A");
    }
}
