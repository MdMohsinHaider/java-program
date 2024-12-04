package com.jspider.stringclasses.stringbuilder;

    /*
    * Introduced in java version 1.5
    * String builder is a class which used to crete mutable objects.
    * It is a non-Synchronized object.
    *
    * StringBuilder s1 = new StringBuilder("Mohan");
    * String s2 = "John";  // Normal String
    * StringBuilder s3 = new StringBuilder("Jack");
    * StringBuilder s4 = new StringBuilder("s2");
    * StringBuilder s5 = new StringBuilder(s3);
    *
    * */

public class StringBuilderClass {
    public static void main(String[] args) {
        /*
         // 1.
        StringBuilder sb = new StringBuilder(); // default capacity 16.
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println("\n=========================\n");

        sb.append("Mohan");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println("\n=========================\n");

        sb.append("Singh and Rohan singh");
        System.out.println(sb.capacity());
        System.out.println(sb.length());

         */

        /* // 2. ---------------------------------------
        StringBuilder sb = new StringBuilder(1000);
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        */

       /* // 3.------------------------
        String s1 = "Mohan";
        StringBuilder sb = new StringBuilder(s1);
        sb.insert(2,"so");
        System.out.println(s1);
        System.out.println(sb);
        */

       /* // 4. ------------------------------
        StringBuilder sb = new StringBuilder("Mohan");
        sb.replace(1,3,"os");
        System.out.println(sb);

        */

       /* // 5.
        StringBuilder sb = new StringBuilder("Hello");
        sb.delete(1,3);
        System.out.println(sb);

        */

        String s1 = "Mohan is here";
        StringBuilder sb = new StringBuilder(s1);
        sb.reverse();
        System.out.println(sb);
    }
}
