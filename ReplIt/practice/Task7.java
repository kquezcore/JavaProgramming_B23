package practice;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        // write your code below


    }
}
/*
Task7:

Write a program that will find out shortest words in the given string str.
If there are few words that are evenly short, print them all. Use split method in order
 to split str string variable and create an array of strings. Print array with Arrays.toString() method.
 Sort array before printing.

Hint: Split values by comma: split(", ");

input: olive, fish, pursuit, old, warning, python, java, coffee, cat, ray

output: [cat, old, ray]
 */