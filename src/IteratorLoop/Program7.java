package src.IteratorLoop;

/*
*
*       Design a method which will count even integer numbers from a collections.
*
* */


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Program7 {
    public static void main(String[] args) {
        Collection c1 = new ArrayList();
        c1.add(23);
        c1.add(45.6);
        c1.add("Mohan");
        c1.add(45);
        c1.add(44.77);
        c1.add("Sohan");
        c1.add(44);
        c1.add(57);
        c1.add(100);
        c1.add(55);
        c1.add(200);
        c1.add(45.8);
        c1.add("John");
        countEvenInteger(c1);
    }

    public static void countEvenInteger(Collection c){
        int count = 0;
        Iterator itr = c.iterator();
        while (itr.hasNext()){
            Object o = itr.next();
            if (o instanceof Integer && (Integer) o%2 ==0){
                count++;
            }
        }
        System.out.print("Total Number of present even Integer is "+count);
    }
}
