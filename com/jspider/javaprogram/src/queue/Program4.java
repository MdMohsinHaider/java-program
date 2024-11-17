package com.jspider.javaprogram.src.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Program4 {
    public static void main(String[] args) {
        int[] array = {0,2,4,6,8,0,1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9,0,0,9,8,7,6,5,4,3,2,1};
        for (int p:array){
            System.out.print(p+" ");
        }
        System.out.print("\n");
        printSmallestSecondSmallestElementArray(array);
    }

    private static void printSmallestSecondSmallestElementArray(int[] array){
        Queue<Integer> q1 = new PriorityQueue<>();
        for (int p: array){
            q1.offer(p);
        }
        int smallest_element = q1.poll();
        int second_smallest_element = smallest_element;
        while (!q1.isEmpty()){
            int temp = q1.poll();
            if (smallest_element != temp){
                second_smallest_element = temp;
                break;
            }
        }

        System.out.print("After : "+q1+"\n");
        System.out.println("Smallest element is : "+smallest_element);
        System.out.println("Second smallest element is : "+second_smallest_element);
    }
}
