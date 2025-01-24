package com.jspider.javaprogram.src.practices1.Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Program2 {
    public static void main(String[] args) {
        getOdd();
    }

    public static void getOdd(){
        Collection c1 = new ArrayList();
        c1.add(12);
        c1.add(13);
        c1.add(56);
        c1.add(98);
        c1.add(89);
        System.out.println(c1);

        Iterator itr = c1.iterator();
        while (itr.hasNext()){
            int x =(int) itr.next();
            if(x%2==0){
                itr.remove();
            }
        }
        System.out.println(c1);
    }
}
