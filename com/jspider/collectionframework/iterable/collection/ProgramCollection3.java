package com.jspider.collectionframework.iterable.collection;

import java.util.ArrayList;
import java.util.Collection;

public class ProgramCollection3 {
    public static void main(String[] args) {
        Collection c1 = new ArrayList();
        c1.add(23);
        c1.add(23.45);
        c1.add("mohan");
        c1.add('@');
        c1.add(34);
        Object[] x = c1.toArray();
        for (Object o :x){
            System.out.print(o+" ");
        }
    }
}
