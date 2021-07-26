package Arrays_5;

import java.util.Scanner;

public class Array_ReversedSentence2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        //TODO: start your code here

        String[] reversedAr= sentence.split(" ");

        for (int i = reversedAr.length-1; i >=0 ; i--) {
            System.out.println(reversedAr[i]+" ");
        }

    }
}

/*
Given a String variable sentence, write code to get each word and assign to String reversed in reverse order.

Example:

sentence -> Java is fun

reversed > fun is Java
 */