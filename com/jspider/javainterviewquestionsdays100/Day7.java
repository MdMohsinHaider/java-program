package com.jspider.javainterviewquestionsdays100;

/**
 * <h1> Is Java a Pure Object oriented Program?. If No, why?
 * <p>Solution :
 * <li> The reason why Java is an object-oriented programming language at 99.9% is
 * because primitive types exist in Java which you must be aware of like byte short and float long.
 * We use all these types in programming language which are not objects.
 * Basically, they do not have any class, and we use them directly without creating an object.
 * That is why we cannot make Java purely object-oriented because these have nothing to do with objects.
 * Now, to use them as an object, wrapper classes have been given to us in Java.
 * The Java people told us to use wrapper classes so that if you ever want to use these primitive
 * types as objects, then they correspond to every type, and they also do not belong to objects.
 * Now all these things are such in Java that have nothing to do with objects. That is why any
 * language should not be used to use primitive types. We can call it pure object-oriented only when
 * everything can be used as an object, an object is created from a class, and we can use it as an
 *  object, but there are many things in Java which have nothing to do with objects, that is why we do
 * not call Java a pure object-oriented programming language.
 */
public interface Day7 {

    // Default method to explain and demonstrate the concept
    default void explainJavaOOP() {
        // Primitive types
        int primitiveInt = 10;
        double primitiveDouble = 20.5;

        // Using wrapper classes to treat primitives as objects
        Integer wrapperInt = primitiveInt; // Auto-boxing
        Double wrapperDouble = primitiveDouble; // Auto-boxing

        // Demonstrating auto-boxing and unboxing
        int unboxedInt = wrapperInt; // Unboxing

        // Wrapper class method usage (No output shown)
        wrapperInt.toString(); // Just invoking method without printing
    }
}