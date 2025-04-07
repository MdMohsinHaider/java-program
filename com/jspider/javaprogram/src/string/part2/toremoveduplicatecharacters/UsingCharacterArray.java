package com.jspider.javaprogram.src.string.part2.toremoveduplicatecharacters;

public class UsingCharacterArray {
    public static void main(String[] args) {
        String str = "programming";

        char[] charArray = str.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <charArray.length ; i++) {
            boolean repeated = false;
            for (int j = i+1; j < charArray.length; j++) {
                if (charArray[i] == charArray[j]){
                    repeated = true;
                    break;
                }
            }
            if (!repeated){
                stringBuilder.append(charArray[i]);
            }
        }
        System.out.println(stringBuilder);
    }
}
