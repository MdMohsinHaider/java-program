package com.jspider.javaprogram.src.practices.set;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Program2 {
    public static void main(String[] args) {
        Integer[] array ={12,65,87,45,12,65,98,67,56,98,45,90,45,56,87};
        Integer[] a = removeDuplicate(array);
        System.out.println(Arrays.toString(a));
    }

    private static Integer[] removeDuplicate(Integer[] array) {
        Set<Integer> s1 = new HashSet<>();

        Collections.addAll(s1, array);

        Integer [] array2 = new Integer[s1.size()];
        int i =0;
        for (Integer p:s1){
            array2[i] =p;
            i++;
        }

        return array2;
    }
}
