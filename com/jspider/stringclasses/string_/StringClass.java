package com.jspider.stringclasses.string_;


    /*
    * What is the difference between String, StringBuilder and StringBuffer?
    *
    * it provides mutable String
    * it is sense java 1.0
    * It is not Synchronises
    * It provides Fast Performance
    * It is not thread Safe
    *
    *
    * */
public class StringClass {
    public static void main(String[] args) {
//        String s1 = "Mohan";
//        System.out.println(s1);
//        s1 = s1.substring(0,2)+"so"+s1.substring(2);
//        System.out.println(s1);





        String s1 = "Mohan";
        System.out.println(s1);
        s1 = s1.substring(0,1)+"so"+s1.substring(3);
        System.out.println(s1);
    }
}
