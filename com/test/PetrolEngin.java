package com.test;

public class PetrolEngin implements Engine {

    @Override
    public int start() {
        System.out.println("Petrol Engine Start");
        return 1;
    }
}
