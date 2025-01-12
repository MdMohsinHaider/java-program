package com.jspider.multithreading.how_to_create_thread.extending_thread_class;

public class World extends Thread {
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
