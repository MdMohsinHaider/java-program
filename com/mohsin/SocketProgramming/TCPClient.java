package com.mohsin.SocketProgramming;

import java.io.*;
import java.net.*;

public class TCPClient {

    public void getClient() {
        Socket socket = null;
        try {
            socket = new Socket("localhost", 5000);
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            out.println("Hello Server Mohsin");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        finally {
            try {
                assert socket != null;
                socket.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
