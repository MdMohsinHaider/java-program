package com.jspider.Leetcode;

import org.jetbrains.annotations.NotNull;

/**
 * Project: LeetCode Solutions
 * Problem: 3110. Score of a String
 * Description: Computes the score of a string based on the sum of the absolute
 *              differences between the ASCII values of adjacent characters.
 * Author: Md Mohsin Haider
 * Date: June 3, 2025
 */
public class ScoreString {
    public static void main(String[] args) {
        ScoreString scoreString = new ScoreString();
        int score = scoreString.scoreOfString("Hello");
        System.out.println("score = " + score);
        System.out.println("GetScore = "+scoreString.getScore("Hello"));
    }

    /**
     * Calculates the score of a given string.
     * The score is the sum of absolute differences of ASCII values between adjacent characters.
     *
     * @param s The input string consisting of only lowercase English letters.
     * @return The total score as an integer.
     *
     * Example:
     * Input: "hello"
     * Output: 13
     * Explanation:
     *     ASCII values: h=104, e=101, l=108, l=108, o=111
     *     Score: |104-101| + |101-108| + |108-108| + |108-111| = 3 + 7 + 0 + 3 = 13
     */
    public int scoreOfString(String s) {
        int score = 0;
        for (int i = 1; i < s.length(); i++) {
            score += Math.abs(s.charAt(i) - s.charAt(i - 1));
        }
        return score;
    }

    // custom method
    public int getScore(@NotNull String s){
        int score = 0;
        for (int i = 1; i <s.length() ; i++) {
            int num = s.charAt(i-1)-s.charAt(i);
            if (num<0){
                num = Math.abs(num);
            }
            score = score+num;
        }
        return score;
    }
}
