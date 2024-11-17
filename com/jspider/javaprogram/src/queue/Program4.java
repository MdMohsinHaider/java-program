package com.jspider.javaprogram.src.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Program4 {
    public static void main(String[] args) {
        int[] array = {0,2,4,6,8,0,1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9,0,0,9,8,7,6,5,4,3,2,1};
        printSmallestSecondSmallestElementArray(array);
    }

    private static void printSmallestSecondSmallestElementArray(int[] array){
        Queue<Integer> q1 = new PriorityQueue<>();
    }
}
