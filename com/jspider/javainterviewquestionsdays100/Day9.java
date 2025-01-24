package com.jspider.javainterviewquestionsdays100;

/**
 *<h1> You have a value 3.5. What happens when you assign a double value to a
 * float variable without explicit casting, and how does truncation affect the value stored?
 * <p>Solution :
 * <code> Let's understand the first concept you have to understand is that
 * by default in Java, any normal point value is treated as a double. That means if you
 * have any point value, it will be treated as double, and you can put it inside a double
 * type variable. If you want to make a float value, then you have literals, you can use f for the float.
 * If you put f after that value, then the value of float will be created. The concept of truncation
 * comes here that when you are converting a value into any other data type, now if we put this
 * integer value in short, then now we are putting a large data type into a smaller data type, so
 * there are chances of data loss here. It will be truncation. Brother, whatever is in
 * the container, you are putting it in a smaller container. The same thing happens here when
 * the format changes like - for example, we have a float value. And we will do this in integers.
 */
public class Day9 {
    public static void main(String[] args) {
//        float f = 3.5; ❌
        float f = 3.5f;
    }
}