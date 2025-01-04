package com.jspider.collectionframework.iterable.iterator.collection.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Class1 {

    public static void main(String[] args) {

        // Crete Arraylist Object
        List<Integer> fiveFirstPrimeNumber = new ArrayList<>();
        fiveFirstPrimeNumber.add(3);
        fiveFirstPrimeNumber.add(5);
        fiveFirstPrimeNumber.add(7);
        fiveFirstPrimeNumber.add(11);
        fiveFirstPrimeNumber.add(13);

        List<Integer> tenPrimeNumber = new ArrayList<>(fiveFirstPrimeNumber);
        System.out.println("step 1 : "+ tenPrimeNumber);

        List<Integer> nextFivePrimeNumber = new ArrayList<>();
        nextFivePrimeNumber.add(17);
        nextFivePrimeNumber.add(19);
        nextFivePrimeNumber.add(23);
        nextFivePrimeNumber.add(29);
        nextFivePrimeNumber.add(31);

        tenPrimeNumber.addAll(nextFivePrimeNumber);
        System.out.println("step 2 : "+ tenPrimeNumber);

    }
}
