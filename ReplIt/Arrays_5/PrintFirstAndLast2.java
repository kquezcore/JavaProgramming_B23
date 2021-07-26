package Arrays_5;

import java.util.Arrays;
import java.util.Scanner;

public class PrintFirstAndLast2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()};


        //TODO: Write your code below

        String []arr= new String[words.length];

        for (int i = 0, j=0; i < words.length; i++,j++) {
        arr [j]=""+words[i].charAt(0) + words[i].charAt(words[i].length()-1);
        }
        System.out.println(Arrays.toString(arr));
    }
}

/*
Given a String array words, iterate through each word and print first and last letter
of each element in the format below. Put each first and last letter in an array.

Example:

words → ["hello", "why", "by", "apple" , "note"]

print → [ho, wy, by, ae, ne]
 */