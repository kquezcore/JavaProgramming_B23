package Strings_3;

import java.util.Scanner;

public class FistAndLast {
    public static void main(String[] args) {
        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE
        char first= word.charAt(0);

       word= word.substring(word.length()-1);

        System.out.println(first+" "+word);
    }
}
/*

Write a program that will print out first and last letters together.

```
Input: adobe
```

```
Output: ae
```
 */