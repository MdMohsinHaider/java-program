package com.jspider.multithreading.thread_lifecycle;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("RUNNING");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {

        // 1. state-> @New: A thread is in this state when it is created but no yet started.
        MyThread thread0 = new MyThread();
        System.out.println(thread0.getState());



        // 2. state-> @Runnable: After the start method is called, the thread
        //becomes runnable. It's ready to run and is waiting for CPU time.
        thread0.start();
        System.out.println(thread0.getState());


        // 3. state-> @Running: The thread is in this state when it is executing.
        Thread.sleep(1000); // sleep the main thread for 1 second



        // 4. state-> @Blocked /Waiting: A thread is in this state when it is
        // waiting for a resource or for another thread to perform an action.
        System.out.println(thread0.getState());



        // 5. state-> @Terminated: A thread is in this state when it has finished executing.
        thread0.join();
        System.out.println(thread0.getState());
    }
}
