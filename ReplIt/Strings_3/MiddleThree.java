package Strings_3;

import java.util.Scanner;

public class MiddleThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE

        int count= word.length();

        if (count%2==0 ||count<5) {
            System.out.println("invalid");
        }else{
            int midPoint= count/2;
            System.out.println(word.substring(midPoint-1, midPoint +2));
        }

    }
}


/*
Given a String variable word print the middle three characters if the word is an odd number
 of characters and has more than 5 characters. If the word does not meet the requirements print invalid.

fifteen ==> fte
fifteen ==> fte
apple ==> ppl
apple ==> ppl
hey ==> invalid
hey ==> invalid
java ==> invalid
java ==> invalid
whatsup ==> ats
whatsup ==> ats
$ ==> invalid
 */