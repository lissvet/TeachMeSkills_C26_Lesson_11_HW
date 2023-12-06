package com.teachmeskills.lesson11.task0;

import com.teachmeskills.lesson11.task0.srevice.StringOperation;
/**Write a program with the following functionality:
 * Pass a string (which is some standardized document number in a given format) as input.
 * The document number has the format xxxx-yyyy-xxxxx-yyyy-xyxyxy, where x is any digit and y is a letter of the Latin alphabet (can be large and small).
        - Print the first two blocks of 4 digits on one line.
        - Display the document number, but replace blocks of three letters with *** (each letter will be replaced with *).
        - Display only one letter of the document number in the format yyy/yyyy/y/y/y in lower case.
        - Display letters from the document number in the format "Letters:yyy/yyyy/y/y/y/y" in uppercase (implement using StringBuilder class).
        - Check if the document number contains the sequence "abc" and display the message whether it does or not (abc and ABC are considered to be the same sequence).
        - Check if the document number starts with the sequence 555.
        - Check if the document number ends with the sequence 1a2b.
 *Implement all these methods in a separate class in static methods, each task in a separate method.
 *The methods will take as input (input parameter) the string input to the program.**/
public class Runner {

    public static void main(String[] args) {
        String docNumber = "1098-AbC-6743-THN-1a2b";

        StringOperation.showFirstTwoBlocks(docNumber);
        StringOperation.replaceLettersBlocks(docNumber);
        StringOperation.showLettersLowerCase(docNumber);
        StringOperation.showLettersUpperCase(docNumber);
        StringOperation.checkABC(docNumber);
        StringOperation.checkStringStarts555(docNumber);
        StringOperation.checkStringEnds1a2b(docNumber);
    }

}
