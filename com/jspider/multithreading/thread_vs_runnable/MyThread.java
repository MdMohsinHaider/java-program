package com.jspider.multithreading.thread_vs_runnable;

public class MyThread extends Thread {

    public MyThread(String name){
        super(name);
    }

    @Override
    public void run(){
        for (int i = 0; i < 5 ; i++) {
            System.out.println(Thread.currentThread().getName());
//            Thread.yield();
        }
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread("t1");
        t1.start();
        MyThread t2 = new MyThread("t2");
        t2.start();
    }
}
