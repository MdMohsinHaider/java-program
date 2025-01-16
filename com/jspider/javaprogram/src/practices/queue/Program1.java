package com.jspider.javaprogram.src.practices.queue;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class Program1 {
    public static void main(String[] args) {
        int[] array = {0,2,4,6,8,0,1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9,0,0,9,8,7,6,5,4,3,2,1};
        for (int p:array){
            System.out.print(p+"  ");
        }
        System.out.println("\n");
        shortArrayElements(array);
        Map<Integer,String> map = new HashMap<>();
    }

    private static void shortArrayElements(int[] array){
        Queue<Integer> q1 = new PriorityQueue<>();
        for (int p:array){
            q1.offer(p);
        }
        for (int i = 0; i <array.length ; i++) {
            array[i] = q1.poll();
        }

        for (int p:array){
            System.out.print(p+"  ");
        }
    }
}
