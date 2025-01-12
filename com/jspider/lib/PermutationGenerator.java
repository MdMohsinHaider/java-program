package com.jspider.lib;

import java.util.ArrayList;
import java.util.List;

public class PermutationGenerator implements Runnable {
    private String input;

    public PermutationGenerator(String input) {
        this.input = input;
    }

    @Override
    public void run() {
        List<String> permutations = new ArrayList<>();
        generatePermutations("", input, permutations);
        System.out.println("All possible permutations:");
        for (String permutation : permutations) {
            System.out.println(permutation);
        }
    }

    private void generatePermutations(String prefix, String remaining, List<String> result) {
        if (remaining.isEmpty()) {
            result.add(prefix);
        } else {
            for (int i = 0; i < remaining.length(); i++) {
                generatePermutations(prefix + remaining.charAt(i),
                        remaining.substring(0, i) + remaining.substring(i + 1),
                        result);
            }
        }
    }
}

