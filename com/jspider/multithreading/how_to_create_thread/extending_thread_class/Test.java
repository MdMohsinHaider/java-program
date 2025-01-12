package com.jspider.multithreading.how_to_create_thread.extending_thread_class;

public class Test {
    public static void main(String[] args) {

        World world = new World();
        world.start();


        for ( ; ; ) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
