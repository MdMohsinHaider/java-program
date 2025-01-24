package com.jspider.javainterviewquestionsdays100;

/**
 * <h1> if you have a double type a value, and you convert into integer Type value.
 * is it an Automatic or ForceFul Process?
 * <p>Solution :
 * <code> Casting means if you have a value of one type, and we convert it
 * to a value of another type, this is called type casting in Java. There are two ways of
 * type casting in Java. First is type casting. Implicit type casting means it happens
 * automatically. If you have a small value, and you want to convert it to a value of a larger
 * data type, then mostly focus on the word mostly implicit. Mostly, this happens automatically
 * and if you do forceful conversion, many times you have a value of a larger data type, and you
 * convert it to a smaller one; then it is called explicit type casting. But many times this
 * does not happen. There are many data types like double if you want to convert it to antigen,
 * then here you have to see the value as well. For example, if it is 4.5, and if you convert it
 * to integer, then 4.5 because integer is not able to store the value of point, then the value
 * of the point will be lost. So wherever loss of data is taking place, Even in conversion, it will
 * always be forceful. Java will not do loss of data on its own. That is why it is called explicit
 * type casting. Remember, whenever you are doing conversion, is there any loss of data or not? And
 * you should not directly tell whether it is a small or big data type. You should check the loss of
 * data once. Is there any loss of data in going from one data type to another? If there is loss of data,
 * then it will always be explicit.
 */
public class Day8 {
    public static void main(String[] args) {
        // Implicit Type Casting (Widening Conversion)
        int smallValue = 100;
        long largerValue = smallValue; // Automatically converts int to long

        System.out.println("Implicit Type Casting:");
        System.out.println("Original int value: " + smallValue);
        System.out.println("Converted to long: " + largerValue);

        // Explicit Type Casting (Narrowing Conversion)
        double doubleValue = 45.67;
        int intValue = (int) doubleValue; // Forcefully converts double to int

        System.out.println("\nExplicit Type Casting:");
        System.out.println("Original double value: " + doubleValue);
        System.out.println("Converted to int (data loss): " + intValue);

        // Example of data loss in explicit casting
        double largeNumber = 123456789.987654321;
        float convertedFloat = (float) largeNumber; // Loss of precision

        System.out.println("\nData Loss Example:");
        System.out.println("Original double value: " + largeNumber);
        System.out.println("Converted to float (data loss): " + convertedFloat);

        // Checking for data loss during conversion
        double preciseValue = 5.5;
        int roundedValue = (int) preciseValue; // Fractional part is lost

        System.out.println("\nChecking Data Loss:");
        System.out.println("Original double value: " + preciseValue);
        System.out.println("Converted to int (data loss): " + roundedValue);

        // Safe conversions
        byte byteValue = 42;
        int safeIntValue = byteValue; // No data loss, implicit casting

        System.out.println("\nSafe Conversion:");
        System.out.println("Original byte value: " + byteValue);
        System.out.println("Converted to int: " + safeIntValue);

        // Unsafe conversions
        int largeIntValue = 130;
        byte unsafeByteValue = (byte) largeIntValue; // Data loss due to overflow

        System.out.println("\nUnsafe Conversion (Overflow):");
        System.out.println("Original int value: " + largeIntValue);
        System.out.println("Converted to byte (data loss): " + unsafeByteValue);
    }
}

