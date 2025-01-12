package com.jspider.multithreading.how_to_create_thread.implementing_runnable_interface;

public class Test {
    public static void main(String[] args) {

        World world = new World();
        Thread thread0 = new Thread(world);
        thread0.start();

        Thread thread1 = new Thread(new World());
        thread1.start();


        for ( ; ; ) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
