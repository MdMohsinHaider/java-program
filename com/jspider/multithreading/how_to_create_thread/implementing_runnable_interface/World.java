package com.jspider.multithreading.how_to_create_thread.implementing_runnable_interface;

public class World implements Runnable {
    public World() {
        super();
    }

    @Override
    public void run() {
        for ( ; ;) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
