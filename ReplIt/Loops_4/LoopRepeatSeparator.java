package Loops_4;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class LoopRepeatSeparator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String separator = scan.next();
        int count = scan.nextInt();

        String result = word;

        for (int i = 0; i <= count - 2; i++) {
            result = result + separator + word;

            System.out.println(result);
        }
    }
}
/*
Given two strings, word and a separator sep,
return a big string made of count occurrences of the word, separated by the separator string.

Example:

input:
Word
X
3

output: WordXWordXWord
input:
Word
X
3

output: WordXWordXWord
Example:

input:
This
And
2

output: ThisAndThis
input:
This
And
2

output: ThisAndThis
Example:

input:
This
And
1

output: This
 */