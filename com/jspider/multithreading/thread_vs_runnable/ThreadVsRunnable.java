package com.jspider.multithreading.thread_vs_runnable;

/**
 * Thread Class vs Runnable Interface in Java
 *
 * <div>This file provides an explanation and comparison of the two primary ways to create threads in Java:<div/>
 * <li>- Using the Thread Class<li/>
 * <li>- Using the Runnable Interface</li>
 */
public class ThreadVsRunnable {

    /**
     * Example demonstrating the Thread Class approach.
     */
    static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("Thread is running using Thread class.");
        }
    }

    /**
     * Example demonstrating the Runnable Interface approach.
     */
    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("Thread is running using Runnable interface.");
        }
    }

    public static void main(String[] args) {
        // Using the Thread Class
        MyThread thread1 = new MyThread();
        thread1.start();

        // Using the Runnable Interface
        MyRunnable myRunnable = new MyRunnable();
        Thread thread2 = new Thread(myRunnable);
        thread2.start();

        // Key differences
        System.out.println("\nKey Differences:\n");
        System.out.println("1. Inheritance: Thread class requires extending the Thread class, limiting further inheritance.");
        System.out.println("2. Flexibility: Runnable interface supports multiple inheritance and promotes loose coupling.");
        System.out.println("3. Use Case: Use Thread class for direct thread behavior, Runnable for task separation.");
    }
}


