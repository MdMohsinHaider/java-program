package com.jspider.javaprogram.src.string.part2.toremoveduplicatecharacters;

public class UsingIndexOf {
    public static void main(String[] args) {
        String str = "programming";

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <str.length() ; i++) {
            char c = str.charAt(i);

            int index = str.indexOf(c, i+1); // if c charter present in string then return its index
            if (index == -1){
                stringBuilder.append(c);
            }
        }
        System.out.println(stringBuilder);
    }
}
