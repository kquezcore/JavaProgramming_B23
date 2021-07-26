package Strings_3;

import java.util.Scanner;

public class PrintLastCharacter {
    public static void main(String[] args) {
        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE
        char lastCharacter=word.charAt(word.length()-1);
        System.out.println(lastCharacter);
    }
}
/*

Write a program that will print out last letter of the word (string).

Ex:
```
Input: java
```
```
Output: a
```
 */