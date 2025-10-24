package com.mohsin.SocketProgramming;

import java.io.*;
import java.net.*;

public class TCPServer {

    public void getServer() {
        Socket socket = null;
        ServerSocket serverSocket = null;
        try {
            serverSocket= new ServerSocket(5000);
            System.out.println("Server started... Waiting for client...");
            socket = serverSocket.accept();
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String message = in.readLine();
            System.out.println("Client says: " + message);
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
            try {
                serverSocket.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
