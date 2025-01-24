package com.jspider.javainterviewquestionsdays100;

/**
 * <h1> Is Java a Pure Object oriented Program?. If No, why?
 * <p>Solution : <code> The reason why Java is an object-oriented programming language at 99.9 is
 * because primitive types exist in Java which you must be aware of like byte short and float long.
 * We use all these types in programming language which are not objects.
 * Basically, they do not have any class, and we use them directly without creating an object.
 * That is why we cannot make Java purely object-oriented because these have nothing to do with objects.
 * Now to use them as an object, wrapper classes have been given to us in Java.
 * The Java people told us to use wrapper classes so that if you ever want to use these primitive
 * types as objects, then they correspond to every type, and they also do not belong to objects.
 * Now all these things are such in Java that have nothing to do with objects. That is why any
 * language should not be used to use primitive types. We can call it pure object-oriented only when
 * everything can be used as an object, an object is created from a class, and we can use it as an
 * object but there are many things in Java which have nothing to do with objects, that is why we do
 * not call Java a pure object-oriented programming language.
 */
public class Day7 {
    public static void main(String[] args) {
        // Example of primitive types
        int primitiveInt = 10; // Primitive type: int
        double primitiveDouble = 20.5; // Primitive type: double

        // These are not objects, and we use them directly without creating a class or object
        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("Primitive double: " + primitiveDouble);

        // Using wrapper classes to treat primitives as objects
        Integer wrapperInt = Integer.valueOf(primitiveInt); // Wrapping int into an Integer object
        Double wrapperDouble = Double.valueOf(primitiveDouble); // Wrapping double into a Double object

        // Wrapper classes allow primitive types to be used as objects
        System.out.println("Wrapper Integer object: " + wrapperInt);
        System.out.println("Wrapper Double object: " + wrapperDouble);

        // Demonstrating auto-boxing and unboxing
        Integer autoBoxedInt = primitiveInt; // Auto-boxing: primitive to object
        int unboxedInt = wrapperInt; // Unboxing: object to primitive

        System.out.println("Auto-boxed Integer: " + autoBoxedInt);
        System.out.println("Unboxed int: " + unboxedInt);

        // Showing that primitives do not have methods
        //  Uncommenting, the following line will cause a compilation error
        // primitiveInt.toString(); // Error: primitive types do not have methods

        // Wrapper classes, being objects, provide methods
        System.out.println("Wrapper Integer as String: " + wrapperInt.toString());

        // Why Java is not purely object-oriented
        // Primitive types exist in Java, which are not objects
        System.out.println("Java is not purely object-oriented because of primitive types like int, double, etc.");
    }
}


