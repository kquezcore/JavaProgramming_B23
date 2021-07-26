package Strings_3;

import java.util.Scanner;

public class WithoutXx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        if (word.startsWith("x")||word.startsWith("X")&&word.endsWith("X")||word.endsWith("x")){
            word=word.substring(1,word.length()-1);
            System.out.println(word);
        } else if((word.startsWith("x") || word.startsWith("X"))){
            word=word.substring(1);
            System.out.println(word);
        } else if(word.endsWith("x")||word.endsWith("X")){
            word=word.substring(0,word.length()-1);
            System.out.println(word);
        } else {
            System.out.println(word);
        }
        }
    }

/*
Given a string word, if the first or last chars are 'x' or 'X', print the string without those
'x' or 'X' chars, otherwise print the string unchanged.

Example:

input: xHiX

output: Hi
input: xHiX

output: Hi
input: apple

output: apple
input: apple

output: apple
input: xUxL

output: UxL
input: xUxL

output: UxL
input: JavaX

output: Java
 */