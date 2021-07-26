package Arrays_5;

import java.util.Arrays;
import java.util.Scanner;

public class Array_SplitSentence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        //type your code below
        String[] words = sentence.split(" ");

        for (int i =0; i < words.length; i++) {
            System.out.println(words[i]);

        }
    }
}


/*
Given a String variable sentence, write code to type each word in separate lines.

Example:

sentence -> "Java is fun"

Print

Java
is
fun
 */