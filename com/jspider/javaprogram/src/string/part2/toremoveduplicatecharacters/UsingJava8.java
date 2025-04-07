package com.jspider.javaprogram.src.string.part2.toremoveduplicatecharacters;

public class UsingJava8 {
    public static void main(String[] args) throws ClassNotFoundException {
        String str = "programming";

        StringBuilder stringBuilder = new StringBuilder();

        str.chars().distinct().forEach(c -> stringBuilder.append((char) c));
        System.out.println(stringBuilder);

    }
}
