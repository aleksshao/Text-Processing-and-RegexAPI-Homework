package com.company;

import java.util.Scanner;

public class CountSubstringOccurrences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String words = input.nextLine().toLowerCase();
        String word = input.nextLine().toLowerCase();

        int countOfWords = 0;
        int lastIndex = 0;

        while ((lastIndex = words.indexOf(word, lastIndex)) != -1){
            countOfWords ++;
            lastIndex += word.length() - 1;
        }
        System.out.println(countOfWords);
    }

}
