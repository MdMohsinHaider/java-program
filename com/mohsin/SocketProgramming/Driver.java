package com.mohsin.SocketProgramming;

public class Driver {
    public static void main(String[] args) {
        TCPServer server = new TCPServer();
        TCPClient client = new TCPClient();

        // Thread for Server
        Thread t1 = new Thread(new Runnable() {

            @Override
            public void run() {
                server.getServer();
            }
        });

        // Thread for Client
        Thread t2 = new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    // Delay to ensure the server starts first
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    System.err.println(e.getMessage());
                }
                client.getClient();
            }
        });


        // Start server first
        t1.start();

        // Then start client
        t2.start();


    }
}
