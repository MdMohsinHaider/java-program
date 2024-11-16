package com.jspider.javaprogram.src.set;

// From a given array or Arraylist remove all the duplicate elements and print it.

import java.util.HashSet;
import java.util.Set;

public class Program1 {
    public static void main(String[] args) {
        int[] array ={12,65,87,45,12,65,98,67,56,98,45,90,45,56,87};
        removeDuplicate(array);
    }

    public static void removeDuplicate(int[] array){
        Set<Integer> s1 = new HashSet<>();
        for (int p:array){
            s1.add(p);
        }
        System.out.println(s1);
    }
}
