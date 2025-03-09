package com.jspider.stringclasses.string_;


import java.util.Arrays;
import java.util.regex.Pattern;

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
//            equalsIgnoreCaseMethod();
//            toCharArrayMethod();
//            valueOfMethod();
//            compareToMethod();
//            compareToIgnoreCaseMethod();
//            startsWithMethod();
//            endsWithMethod();
//            replaceMethod();
//            indexOfMethod();
//            lastIndexOfMethod();
            substringMethod();
//            replaceCharSequenceMethod();
//            stripLeadingMethod();
//            getBytesMethod();
//            containsMethod();
//            indentMethod();
//            repeatMethod();
//            splitMethod();
//            joinMethod();
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

        /**
         * Converts this string to a new character array.
         */
        private static void toCharArrayMethod(){
            String s1 = "Hello Mr Mohsin  haider";
            System.out.println(s1);
            char[] s2 = s1.toCharArray();
            for (char c : s2) {
                System.out.print(c+"  ");
            }
        }

        /**
         * Returns the string representation of the
         * argument.
         */
        private static void valueOfMethod(){
            int a = 10;
            boolean b = true;
            char c = 'm';
            double d = 10.9;
            System.out.println(a+20); // 30
            // a convert into String
            String s1 = String.valueOf(a);
            System.out.println(s1+20); // 1020

            String s2 = String.valueOf(b);
            System.out.println(s2+12); // true12

            String s3 = String.valueOf(c);
            System.out.println(s3+22); // m22

            String s4 = String.valueOf(d);
            System.out.println(s4+47); // 10.947

        }

        /**
         * Compares two strings
         * lexicographically and returns integer value.
         */
        private static void compareToMethod(){
            String s1 = "Mohsin";
            String s2 = "Haider";
            int a = s1.compareTo(s2);
            System.out.println(a);
        }

        /**
         * Compares two strings
         * lexicographically ignoring case and returns integer value.
         */
        private static void compareToIgnoreCaseMethod(){
            String s1 = "Mohsin";
            String s2 = "mohsin";
            int a = s1.compareToIgnoreCase(s2);
            System.out.println(a);
        }

        /**
         * Tests if this string starts with the
         * specified prefix or not.
         */
        private static void startsWithMethod(){
            String s1 = "mdmohsinhaider6@gmail.com";
            boolean b1 =  s1.startsWith("mohsin"); // false
            System.out.println(b1);
            boolean b2 = s1.startsWith("md"); // true
            System.out.println(b2);

            // start with String and its index will be match.
            boolean b3 = s1.startsWith("mdmo",0); // true
            System.out.println(b3);
            boolean b4 = s1.startsWith("mdmoh",1); // false
            System.out.println(b4);
        }

        private static void endsWithMethod(){
            String s1 = "mdmohsinhaider6@gmail.com";
            boolean b1 = s1.endsWith(".com"); // true
            System.out.println(b1);

            boolean b2 = s1.endsWith("gmail.");
            System.out.println(b2);
        }

        /**
         * replace(char oldChar, char newChar): Returns a string
         * resulting from replacing all occurrences of oldChar in this string with
         * newChar.
         */
        private static void replaceMethod(){
            String s1 = "Noida";
            String s2 = s1.replace('i','m');
            System.out.println(s2);

            String s3 = s1.replace("id","ma");
            System.out.println(s3);

            String regex = "id";
            Pattern pattern = Pattern.compile(regex);
            String s4 = s1.replaceAll(regex,"@gmail");
            System.out.println(s4);
        }

        /**
         * Returns the index within this string of the first
         * occurrence of the specified character.
         */
        private static void indexOfMethod(){
            String s1 = "mohsinhaider67@gmail.com";

            System.out.println(s1.indexOf('h')); // 2: Index of given Charter
            System.out.println(s1.indexOf("haider")); // 6:  Index start String

            System.out.println(s1.indexOf('h',3)); // 6
            System.out.println(s1.indexOf("@gmail",2));

            System.out.println(s1.indexOf('h',3,9));
            System.out.println(s1.indexOf("haider",2,8));
        }

        /**
         * Returns the index within this string of the last
         * occurrence of the specified character.
         */
        private static void lastIndexOfMethod(){
                String s1 = "mdmohsinhaider678@gmail.com";

                System.out.println(s1.lastIndexOf('m'));
                System.out.println(s1.lastIndexOf("mohsin"));
                System.out.println(s1.lastIndexOf('m',18));
            }

        /**
         * Returns a string that is a substring of
         * this string. The substring begins with the character at the specified index
         * and extends to the end of this string.
         */
        private static void substringMethod(){
                String s1 = "mdmohsinhaider787@gmail.com";

                System.out.println(s1.substring(13));

                String s2 = s1.substring(13,18); // return data type String
                System.out.println(s2);

                CharSequence s3 = s1.subSequence(2,8); // return data type CharSequence
                System.out.println(s3);
        }

    /**
     * Replaces each substring of this string that matches
     * the literal target sequence with the specified literal replacement
     * sequence.
     */
    private static void replaceCharSequenceMethod(){
            String s1 = "mdmohsinhaider23456@gmail.com";
            String s2 =  s1.replace('m','M');
        System.out.println(s2);

        String s3 = s1.replace("mohsin","devil");
        System.out.println(s3);
    }

    /**
     * Returns a string whose value is this string, with all
     * leading white space removed.
     */
    private static void stripLeadingMethod(){
        String s = new String(" \u2000 Hello \t \u2000 ");
        System.out.println(s.length());
        System.out.println(s+" length: "+s.length());

        String s1 = s.trim();
        System.out.println(s1+" length: "+s1.length());

        String s2 = s.strip();
        System.out.println(s2+" length: "+s2.length());

        // 33.stripLeading():
        String s3 = s.stripLeading();
        System.out.println(s3+" length: "+s3.length());

        // 34.stripTrailing():
        String s4 = s.stripTrailing();
        System.out.println(s4+" length: "+s4.length());
    }

    /**
     * It return byte[] for every characters of String
     */
    private static void getBytesMethod(){
        String s = "Mohsin Haider";
        byte[] b =s.getBytes();
        System.out.println(Arrays.toString(b));
    }

    /**
     * Returns true if and only if this string
     * contains the specified sequence of char values.
     */
    private static void containsMethod(){
        String s = "My name is md mohsin haider";
        System.out.println(s.contains("name"));
    }

    /**
     * Adjusts the indentation of each line of this string based
     * on the value of n, and normalizes line termination characters.
     */
    private static void indentMethod(){
        String s = "I \nam \nMohsin \nhaider";
        System.out.println(s);
        System.out.println("------------After-----------");
        System.out.println(s.indent(4));
    }

    /**
     * Returns a string whose value is the concatenation of
     * this string repeated count times.
     */
    private static void repeatMethod(){
        String s = "Mohsin";
        System.out.println(s.repeat(7));
    }

    /**
     * Splits this string around matches of the given
     * regular expression.
     */
    private static void splitMethod(){
        String s = " I am Mohsin haider ";
        String[] s1 =  s.split("\\s");
        System.out.println(Arrays.toString(s1));
        for (String string : s1) {
            System.out.println(string);
        }
    }

    /**
     * Returns a new String composed of copies of the CharSequence elements
     * joined together with a copy ofthe specified delimiter.
     */
    private static void joinMethod(){
        String message = String.join("-","Md","Mohsin","Haider");
        System.out.println(message);
    }
}
