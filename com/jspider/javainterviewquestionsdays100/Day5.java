package com.jspider.javainterviewquestionsdays100;

        /**
         * Different Ways to Write the Main Method in Java
         */
public class Day5 {

        /**
         * <h1>1. Standard Main Method
         * @param args is actually an argument. You can pass many values
         *             here to take a command line argument while running your program.
         */
        public static void main(String[] args) {
            System.out.println("Hello, World! (Standard Main Method)");
        }


        /**
         * <h1>2. Change the Parameter Name
         * @param arguments is actually an argument. You can pass many values
         *             here to take a command line argument while running your program.
         */
        public static void mainWithDifferentParameterName(String[] arguments) {
            System.out.println("Hello, World! (Parameter Name Changed)");
        }


        /**
         * <h1>3. Use varargs Instead of Array
         * @param args is actually an argument. You can pass many values
         *             here to take a command line argument while running your program.
         */
        public static void mainWithVarargs(String... args) {
            System.out.println("Hello, World! (Varargs Main Method)");
        }


        /**
         * <h1>4. Change the Access Modifier (Default)
         * @param args is actually an argument. You can pass many values
         *             here to take a command line argument while running your program.
         */
        static void mainWithDefaultAccess(String[] args) {
            System.out.println("Hello, World! (Default Access Main Method)");
        }


        /**
         * <h1>4.1 Change the Access Modifier (Protected)
         * @param args is actually an argument. You can pass many values
         *             here to take a command line argument while running your program.
         */
        protected static void mainWithProtectedAccess(String[] args) {
            System.out.println("Hello, World! (Protected Access Main Method)");
        }


        /**
         * <h1>5. Use the final Keyword
         * @param args is actually an argument. You can pass many values
         *             here to take a command line argument while running your program.
         */
        public static final void mainWithFinal(String[] args) {
            System.out.println("Hello, World! (Final Main Method)");
        }


        /**
         * <h1> 6. Use synchronized Keyword
         * @param args is actually an argument. You can pass many values
         *             here to take a command line argument while running your program.
         */
        public static synchronized void mainWithSynchronized(String[] args) {
            System.out.println("Hello, World! (Synchronized Main Method)");
        }


        /**
         * <h1>7. Combine final and synchronized
         * @param args is actually an argument. You can pass many values
         *             here to take a command line argument while running your program.
         */
        public static final synchronized void mainWithFinalAndSynchronized(String[] args) {
            System.out.println("Hello, World! (Final and Synchronized Main Method)");
        }


        /**
         * <h1>8. Java 9 Single-File Program Equivalent
         * @param args is actually an argument. You can pass many values
         *             here to take a command line argument while running your program.
         */
        public static void mainAsSingleFileProgram(String[] args) {
            System.out.println("Hello, World! (Single-File Program Style)");
        }


        /**
         * <h1>9. No Command-Line Arguments
         * non-Argument Type
         */
        public static void mainWithoutArguments() {
            System.out.println("Hello, World! (No Command-Line Arguments)");
        }
}

