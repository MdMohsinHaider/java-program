package com.jspider.javaprogram.src.Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Program1 {
    public static void main(String[] args) {
        getEven();
    }

    public static void getEven(){
        Collection c1 = new ArrayList();
        c1.add(23);
        c1.add(45);
        c1.add(44);
        c1.add(200);
        c1.add(700);
        c1.add(80);
        System.out.println("C1 is : "+c1);

        Iterator itr = c1.iterator();

        while (itr.hasNext()){
            int x = (Integer)itr.next();
            if (x%2 ==1){
                itr.remove();
            }
        }
        System.out.print("Even Number is "+c1);
    }
}
