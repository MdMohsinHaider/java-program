package com.jspider.stringclasses.stringbuffer;

    /*
    * Introduced in java 1.0.
    * It is a Synchronized object
    * String buffer is a class which used to create mutable Strings objects.
    *
    *
    * StringBuffer s1 = new StringBuffer("Mohan");
    * String s2 = "John";  // Normal String
    * StringBuffer s3 = new StringBuffer("Jack");
    * StringBuffer s4 = new StringBuffer("s2");
    * StringBuffer s5 = new StringBuffer(s3);
    *
    * What is difference between String, StringBuilder and StringBuffer?
    * It is Synchronized,
    * it provides Slow performance,
    * It is threaded safe,
    * so it is a recommendation to use in multithreaded environment it threads safety is required.
    * */

public class StringBufferClass {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Mohan");
    }
}
