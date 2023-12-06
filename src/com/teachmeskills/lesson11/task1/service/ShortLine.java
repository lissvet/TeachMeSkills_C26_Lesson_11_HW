package com.teachmeskills.lesson11.task1.service;

import java.util.Scanner;

public class ShortLine {

    public static void findShortestWord(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter arbitrary string divided into words: ");
        String string = scan.nextLine();
        String[] stringArray = string.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 1; i < stringArray.length; i++) {
            if (stringArray[0].length() > stringArray[i].length()) {
                String array0 = stringArray[0];
                stringArray[0] = stringArray[i];
                stringArray[i] = array0;
            }
        }
        result.append("\"");
        result.append(stringArray[0]);
        result.append("\"");

        for (int i = 1; i < stringArray.length; i++) {
            if (stringArray[0].length() == stringArray[i].length()) {
                result.append(" and \"");
                result.append(stringArray[i]);
                result.append("\"");
            }
        }

        System.out.println("Shortest word(s) in a line: " + result);
    }

}
