package Loops_4;

import java.util.Scanner;

public class LoopsEachLetter {

    public static void main(String[] args) {
            Scanner inp = new Scanner(System.in);
            String word = inp.nextLine();

        for (int i = 0;i < word.length(); i++ ) {
            System.out.println(word.charAt(i));
        }

    }
}
/*

Given a String, use a loop to print every character from the String on a new line.

Examples:

Input: hello
h
e
l
l
o
Input: hello
h
e
l
l
o
Input: zimbabwe
z
i
m
b
a
b
w
e
Input: zimbabwe
z
i
m
b
a
b
w
e
Input: wow!
w
o
w
!
 */