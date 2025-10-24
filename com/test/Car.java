package com.test;

public class Car {

    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void drive(){
        int start = engine.start();
        if (start >= 0){
            System.out.println("Car Drive");
        } else {
            System.out.println("Trouble something");
        }
    }

}
