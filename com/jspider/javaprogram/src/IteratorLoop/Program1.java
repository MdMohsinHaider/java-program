package com.jspider.javaprogram.src.IteratorLoop;

import java.util.ArrayList;
import java.util.Collection;

public class Program1 {
    public static void main(String[] args) {
        getElement();
    }

    public static void getElement(){
        Collection c1 = new ArrayList();
        c1.add(12);
        c1.add(18);
        c1.add(36);
        c1.add(40);
        c1.add(47);

        System.out.println(c1);
        for (Object x : c1){
            System.out.println(x);
        }
    }
}
