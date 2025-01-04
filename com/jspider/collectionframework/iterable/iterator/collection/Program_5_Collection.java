package com.jspider.collectionframework.iterable.iterator.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Program_5_Collection {
    public static void main(String[] args) {
        Collection<Integer> c1 = new ArrayList<>();
        c1.add(23);
        c1.add(23);
        c1.add(45);
        c1.add(60);
        c1.add(34);
        Iterator<Integer> itr = c1.iterator();
        int sum = 0 ;
        while (itr.hasNext()){
            sum = sum+itr.next();
        }
        System.out.println("Sum : "+sum);
        /*System.out.println(itr.hasNext());
		System.out.println(itr.next());
		System.out.println(itr.hasNext());
		System.out.println(itr.next());
		System.out.println(itr.hasNext());
		System.out.println(itr.next());
		System.out.println(itr.hasNext());
		System.out.println(itr.next());
		System.out.println(itr.hasNext());
		System.out.println(itr.next());
		System.out.println(itr.hasNext());
		System.out.println(itr.next());*/
    }
}
