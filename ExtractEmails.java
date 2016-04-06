package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String  text = input.nextLine();

        Pattern pattern = Pattern.compile("[\\w0-9._%-]+@[\\w0-9.-]+\\.[\\w]{2,4}");
                                           //[0-9a-zA-Z]([-.\w]*[0-9a-zA-Z_+])*@([0-9a-zA-Z][-\w]*[0-9a-zA-Z]\.)+[a-zA-Z]{2,9}
        Matcher matcher = pattern.matcher(text);

       while(matcher.find()){
           System.out.println(matcher.group());
       }

    }
}
