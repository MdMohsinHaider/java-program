package com.test;

public class DieselEngine implements Engine{

    @Override
    public int start() {
        System.out.println("Diesel Engine Start");
        return 1;
    }
}
