package com.jspider.javaprogram.src.queue;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Program2 {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(7);
        l1.add(9);
        l1.add(34);
        l1.add(1);
        l1.add(7);
        l1.add(8);
        l1.add(4);
        l1.add(2);
        l1.add(6);
        l1.add(9);
        l1.add(3);
        System.out.print(l1+" \n");
        shortListElement(l1);
    }

    private static void shortListElement(List<Integer> l1){
        Queue<Integer> q1 = new PriorityQueue<>(l1);
        l1.clear();
        while (!q1.isEmpty()){
            l1.add(q1.poll());
        }
        System.out.print(l1+" ");
    }
}
