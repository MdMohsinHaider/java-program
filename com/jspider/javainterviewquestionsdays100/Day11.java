package com.jspider.javainterviewquestionsdays100;


/**
 * <h1>Where is the memory for a static variable allocated in Java? Is it allocated
 * in the Heap Area, Method Area, or another memory area? Explain your answer.
 * <p>Solution :
 * <li> Whenever you create a variable and that variable is static, to understand
 * where it will be allocated, we have to understand the various memory areas of JVM.
 * Here, JVM creates five types of memory areas. One is called method class area,
 * one is a heap area, one is a stack area and one is a PC register area, and then
 * there is method native area, method area. Before Java 8, our static variables
 * were stored in method area and class area, and that area was called permanent
 * generation. Okay, in the latest versions of Java 8 and after 8, the architecture
 * of JVM changed and the static variables were allocated in your heap area only.
 */
public interface Day11 {
    // Static variable in the interface
    static final int STATIC_VAR = 100;

    // Default method in the interface
    default void printStaticVar() {
        System.out.println("The value of STATIC_VAR is: " + STATIC_VAR);
    }
}
