package Statements_2;

import java.util.Scanner;

public class ThreeNumber {

    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // Variables are already declared and given
        Scanner s = new Scanner(System.in);

        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int n3 = s.nextInt();

        //your code here

        if (n1 > n2 && n1 > n3) {
            System.out.println("n1 is bigger");
        } else if (n2 > n1 && n2 > n3) {
            System.out.println("n2 is bigger");
        } else {
            System.out.println("n3 is bigger");
        }

        int result = n1+n2+n3;
        System.out.println("result = " + result);
    }
    }
/*

Write a program that checks for the biggest of 3 numbers. you get 3 int variables: n1 , n2 and n3

if n1 is biggest output: "n1 is bigger"
if n2 is biggest output: "n2 is bigger"
if n3 is biggest output: "n3 is bigger"
Example:

121
n2 is bigger
121
n2 is bigger
321
n1 is bigger
321
n1 is bigger
3230
n3 is bigger
 */