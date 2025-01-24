package com.jspider.javainterviewquestionsdays100;

/**
 * You have two non-primitive values check equality by using == and equals. Which one correct Way to check.⁉️
 * <p>Solution :
 * <li> We have to understand that the data type you have taken here is not a
 * primitive type data type. Here you have used integer class wrapper.
 * So whenever you have taken 128, it is a primitive type value but when you assign
 * it inside a wrapper class, here the concept of auto boxing will come, that is, this
 * primitive type value will be converted inside the object, that is, it will become an
 * integer object. Now what will happen is that Java keeps the values of
 * the range from -128 to 127 as a cache memory. That means when you took 127,
 * both were created as a single object, and it was stored in the cache memory,
 * and it was used at both places. Then you compared it and you got the output truth.
 * Now you took 128 and below also you took 128. Now what happened is that
 * Java created new objects here. Two, one different object of this and one different
 * object of this, and when you compared then here reference comparison happened which means
 * both objects are different so the output came false now what is the correct way to compare
 * two objects if you want to compare the value of any object then you have to call equals method
 *  on the first object, and then you have to pass the second object now your output will come correct here
 */
public class Day10 {
    public static void main(String[] args) {

        primary();
        System.out.println("After Change Value");
        secondary();
        System.out.println("Correct Way To Check Equals");
        correctWayToCheckEquals();
    }

    private static void primary() {
        Integer i = 127;
        Integer j = 127;
        System.out.println(i==j); // true ⁉️

    }

    private static void secondary() {
        Integer i = 128;
        Integer j = 128;
        System.out.println(i==j); //  false ⁉️

    }

    private static void correctWayToCheckEquals() {
        Integer i = 128;
        Integer j = 128;
        System.out.println(i.equals(j)); // ✔️

    }
}