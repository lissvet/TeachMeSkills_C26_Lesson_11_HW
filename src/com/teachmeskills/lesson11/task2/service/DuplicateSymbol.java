package com.teachmeskills.lesson11.task2.service;

import java.util.Scanner;

public class DuplicateSymbol {

    public static void doubleEveryLineSymbol(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter line or word: ");
        String string = scan.nextLine();
        char[] stringSymbolArray = string.toCharArray();
        StringBuilder result = new StringBuilder();
        for(char i : stringSymbolArray){
            result.append(i);
            result.append(i);
        }
        System.out.println(result);
    }

}
