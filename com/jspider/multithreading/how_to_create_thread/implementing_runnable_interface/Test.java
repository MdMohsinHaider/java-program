package com.jspider.multithreading.how_to_create_thread.implementing_runnable_interface;

import java.io.Serializable;

public class Test implements Serializable {
    public static void main(String[] args) {

        World world = new World();
        Thread t0 = new Thread(world);
        t0.start();

        Thread t1 = new Thread(new World());
        t1.start();

        Thread t3 = new Thread(new World());
        t3.start();


        for ( ; ; ) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
