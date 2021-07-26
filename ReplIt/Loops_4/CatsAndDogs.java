package Loops_4;

import java.util.Scanner;

public class CatsAndDogs {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();
        for (int i = 0; i <= word.length()-3 ; i++) {
            String each = word.substring(i, i + 3);

            if (each.equals("cat")) {
                countOfCats++;
            }
            if (each.equals("dog")) {
                countOfDogs++;
            }
        }
        System.out.println(countOfCats==countOfDogs);
        }
        }


/*

Print true if the string "cat" and "dog" appear the same number
 of times in the given string word.

Example:

input: catdog
output: true
input: catdog
output: true
Example:

input: catcat
output: false
input: catcat
output: false
Example:

input: cat-cheetah-dog-cat
output: false
 */