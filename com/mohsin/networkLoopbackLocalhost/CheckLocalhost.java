package com.mohsin.networkLoopbackLocalhost;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class CheckLocalhost {
    public static void main(String[] args) {
        try {
            InetAddress[] addresses = InetAddress.getAllByName("localhost");
            for (InetAddress address:addresses){
                System.out.println("Resolve Localhost\t"+address.getHostAddress());
                if (address.getHostAddress().contains(":")){
                    System.out.println("This is IPv6");
                } else {
                    System.out.println("This is IPv4");
                }
            }
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
    }
}
