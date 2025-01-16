package com.jspider.javaprogram.src.practices.arrays;

import java.util.HashSet;
import java.util.Set;

public class RemveDubicates {
    public static void main(String[] args) {
        int[] a = {1,1,2};
        System.out.println(removeDuplicates(a));
//            removeDuplicates(a);
    }

    public static int removeDuplicates(int[] num) {
        Set<Integer> set1 = new HashSet<>();
        for (int p:num){
            set1.add(p);
        }
        System.out.println(set1);
        return set1.size();
    }
}
