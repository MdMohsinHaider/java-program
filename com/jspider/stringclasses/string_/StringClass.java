package com.jspider.stringclasses.string_;


    /**
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
//            internMethod();
//            lengthMethod();
//            isEmptyMethod();
//            isBlankMethod();
//            toLowerCaseMethod();
//            toUpperCaseMethod();
//            trimMethod();
//            concatMethod();
//            charAtMethod();
//            codePointAtMethod();
//            equalsMethod();
            equalsIgnoreCaseMethod();
        }

        /**
         * Returns a canonical representation for the string object.
         * When the intern method is invoked, if the pool already contains a string
         * equal to this String, then the string from the pool is returned. Otherwise,
         * this String object is added to the pool and a reference to this String
         * object is returned.
         */
        private static void internMethod() {
            String s1 = "mohsin"; // created in String constant pool
            String s2 = "mohsin";
            String s3 = new String("mohsin"); // created in heap area directly
            System.out.println(s1==s2); // true
            System.out.println(s1==s3); // false

            // s3 move to constant pool
            String s4 = s3.intern();
            System.out.println(s1==s4); // true
        }

        /**
         * This method returns the length of the given String.
         */
        private static void lengthMethod() {
            String s1 = "Mohan is here";
            System.out.println(s1.length()); // 13
        }

        /**
         * This method returns true if the given String length is zero.
         */
        private static void isEmptyMethod(){
            String s1 = "";
            String s2 = " ";
            String s3 = "Mohsin";
            String s4 = null;
            System.out.println(s1.isEmpty()); // true
            System.out.println(s2.isEmpty()); // false
            System.out.println(s3.isEmpty()); // false
            System.out.println(s4.isEmpty()); // NullPointerException
        }

        /**
         * This method returns true if the string is empty or contains
         * only white space otherwise false.
         */
        private static void isBlankMethod(){
            String s1 = "";
            String s2 = " ";
            String s3 = "Mohsin";
            String s4 = null;
            System.out.println(s1.isBlank()); // true
            System.out.println(s2.isBlank()); // true
            System.out.println(s3.isBlank()); // false
            System.out.println(s4.isBlank()); // NullPointerException
        }

        /**
         * Converts all the characters in this String to lower
         * case.
         */
        private static void toLowerCaseMethod(){
            String s1 = "Mohsin";
            String s2 = "HAIDER";
            System.out.println(s1.toLowerCase());
            System.out.println(s2.toLowerCase());
        }

        /**
         * Converts all the characters in this String to upper
         * case.
         */
        private static void toUpperCaseMethod(){
            String s1 = "Mohsin";
            String s2 = "HAIDER";
            System.out.println(s1.toUpperCase());
            System.out.println(s2.toUpperCase());
        }

        /**
         * To remove blank spaces present yet beginning and end of the
         * string but not middle blank spaces.
         */
        private static void trimMethod(){
            String s1 = " I am devil ";
            System.out.println(s1);
            String s2 = s1.trim();
            System.out.println(s2);
        }

        /**
         * Concatenates the specified string to the end of
         * this string.
         */
        private static void concatMethod(){
            String s1 = "Mohsin";
            String s2 = "Haider";
            System.out.println(s1.concat(s2));
        }

        /**
         * This method returns the character which is
         * available in String at the provided index.
         */
        private static void charAtMethod(){
            String s1 = "Mohsin";
            char c = s1.charAt(0);
            System.out.println(c);
        }

        /**
         * This method returns the ASCII value of
         * the character which is available in String at provided index.
         */
        private static void codePointAtMethod(){
            String s1 = "Mohsin";
            int i = s1.codePointAt(0);
            System.out.println(i);
        }

        /**
         * This method returns true if two strings are equal or
         * it returns false.
         */
        private static void equalsMethod(){
            String s1 = "Mohsin";
            String s2 = "mohsin";
            System.out.println(s1.equals(s2)); // false
        }

        /**
         * This method
         * Compares one String to another String ignoring case considerations.
         */
        private static void equalsIgnoreCaseMethod(){
            String s1 = "Mohsin";
            String s2 = "mohsin";
            System.out.println(s1.equalsIgnoreCase(s2)); // true
        }









}
