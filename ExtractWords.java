package com.company;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractWords {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();

        Pattern pattern = Pattern.compile((""));
        Matcher matcher = pattern.matcher(s);
        String onlyAlphabet = s.replaceAll("[!\"#$%&'()*+,-./:;<=>?@^_`{|}~0123456789]"," ");
        System.out.println(onlyAlphabet);
    }
}

