package com.jspider.javaprogram.src.string.part2.sortstringcharactersalphabeticalorder;

public class WithoutUsingSortMethod {
    public static void main(String[] args) {
        String string = " qwerty ui op as df gh jk lz xc vb nm ";

        char[] charsArray = string.replaceAll("\\s","").toCharArray();
        char temp;

        for (int i = 0; i <charsArray.length ; i++) {
            for (int j = i+1; j < charsArray.length; j++) {
                if (charsArray[i] > charsArray[j]){
                    temp = charsArray[i];
                    charsArray[i] = charsArray[j];
                    charsArray[j] = temp;
                }
            }
        }
        System.out.println(new String(charsArray));
    }
}
