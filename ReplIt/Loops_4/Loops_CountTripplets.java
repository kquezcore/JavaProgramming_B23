package Loops_4;

import java.util.Scanner;

public class Loops_CountTripplets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int count = 0 ;
        //WRITE YOUR CODE HERE

        for (int i = 0; i <= str.length() -3;i++){
            char each = str.charAt(i);
            if (each == str.charAt(i + 1)&& each == str.charAt(i + 2)){
                count++;
            }
        }
        System.out.println(count);
    }

}
/*
We'll say that a "triple" in a string is a char appearing three times in a row. Print out the number of triples in the given string. The triples may overlap.

Example:
input: abcXXXabc
output: 1

input: xxxabyyyycd
output: 3


Example:
input: java

output: 0
 */