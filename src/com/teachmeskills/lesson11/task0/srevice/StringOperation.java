package com.teachmeskills.lesson11.task0.srevice;

import java.util.Arrays;

public class StringOperation {

    public static void showFirstTwoBlocks(String str){
        String[] docNumArray = str.split("-");
        System.out.println(docNumArray[0] + " " + docNumArray[1]);
    }

    public static void replaceLettersBlocks(String str){
        String[] docNumArray = str.split("-");
        docNumArray[1] = "***";
        docNumArray[3] = "***";
        System.out.println(Arrays.toString(docNumArray));
    }

    public static void showLettersLowerCase(String str){
        String[] docNumArray = str.split("-");
        char[] bloc4 = docNumArray[4].toLowerCase().toCharArray();
        System.out.println(docNumArray[1].toLowerCase() + "/" + docNumArray[3].toLowerCase() + "/" + bloc4[1] + "/" + bloc4[3]);
    }

    public static void showLettersUpperCase(String str){
        String[] docNumArray = str.split("-");
        char[] bloc4 = docNumArray[4].toUpperCase().toCharArray();
        StringBuilder result = new StringBuilder("\"Letters: ");
        result.append(docNumArray[1].toUpperCase());
        result.append("/");
        result.append(docNumArray[3].toUpperCase());
        result.append("/");
        result.append(bloc4[1]);
        result.append("/");
        result.append(bloc4[3]);
        result.append("\"");
        System.out.println(result);
    }

    public static void checkABC(String str){
        if(str.toLowerCase().contains("abc")){
            System.out.println("the string contains 'abc'");
        } else {
            System.out.println("the string doesn't contain 'abc'");
        }
    }

    public static void checkStringStarts555(String str){
        if(str.startsWith("555")){
            System.out.println("the string starts '555'");
        } else {
            System.out.println("the string doesn't start '555'");
        }
    }

    public static void checkStringEnds1a2b(String str){
        if(str.toLowerCase().endsWith("1a2b")){
            System.out.println("the string ends '1a2b'");
        } else {
            System.out.println("the string doesn't end '1a2b'");
        }
    }

}
