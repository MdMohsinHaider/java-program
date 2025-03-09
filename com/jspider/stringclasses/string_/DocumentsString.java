package com.jspider.stringclasses.string_;

/**
 * Interface defining various string manipulation operations.
 */
public interface DocumentsString {
    /**
     * Returns the length of the given string.
     */
    int lengthMethod(String s);

    /**
     * Checks if the given string is empty.
     */
    boolean isEmptyMethod(String s);

    /**
     * Converts the given string to lowercase.
     */
    String toLowerCaseMethod(String s);

    /**
     * Converts the given string to uppercase.
     */
    String toUpperCaseMethod(String s);

    /**
     * Trims leading and trailing spaces from the given string.
     */
    String trimMethod(String s);

    /**
     * Concatenates two strings.
     */
    String concatMethod(String s1, String s2);

    /**
     * Returns the character at the specified index of the string.
     */
    char charAtMethod(String s, int index);

    /**
     * Checks if two strings are equal.
     */
    boolean equalsMethod(String s1, String s2);

    /**
     * Checks if two strings are equal, ignoring case.
     */
    boolean equalsIgnoreCaseMethod(String s1, String s2);

    /**
     * Returns a substring of the given string from the specified index.
     */
    String substringMethod(String s, int beginIndex);

    /**
     * Returns a substring of the given string from the specified range.
     */
    String substringMethod(String s, int beginIndex, int endIndex);

    /**
     * Replaces all occurrences of a character in the string.
     */
    String replaceMethod(String s, char oldChar, char newChar);

    /**
     * Returns the index of the first occurrence of a character in the string.
     */
    int indexOfMethod(String s, char ch);

    /**
     * Returns the index of the last occurrence of a character in the string.
     */
    int lastIndexOfMethod(String s, char ch);

    /**
     * Splits the string into an array using the specified delimiter.
     */
    String[] splitMethod(String s, String regex);

    /**
     * Checks if the string contains the specified sequence.
     */
    boolean containsMethod(String s, String sequence);

    /**
     * Joins multiple strings with a delimiter.
     */
    String joinMethod(String delimiter, String... elements);

    /**
     * Repeats the given string a specified number of times.
     */
    String repeatMethod(String s, int count);

    /**
     * Removes leading and trailing white spaces from the string.
     */
    String stripMethod(String s);

    /**
     * Indents the string by the given number of spaces.
     */
    String indentMethod(String s, int n);
}
