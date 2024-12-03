package com.jspider.javaprogram.src.split_method;

public class NumberSum1 {
    public static void main(String[] args) {
        String s = "23!a34@P3qR30@T5";
        // first way
        String[] p = s.split("[^0-9]+");
        /*
        * it will split when every one or more non-numeric character found;
        * */
        System.out.println(p.length);
        int sum=0;
        for (String k:p){
            System.out.print(k+" ");
            sum = sum+Integer.parseInt(k);
        }
        System.out.println();
        System.out.println(sum);
    }
}
