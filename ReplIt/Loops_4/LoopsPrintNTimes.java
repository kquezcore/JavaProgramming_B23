package Loops_4;

import java.util.Scanner;

public class LoopsPrintNTimes {
    public static void main(String[] args) {

        /*
        Given an int variable n print out n asterisks. So if n=5, five asterisks will be printed.

Example:

input: 1

output: *
input: 1

output: *
Example:

input: 3

output: ***
         */
        System.out.println("Enter your number: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        //WRITE YOUR CODE HERE

        for (int i = 0; i <= n ; i++) {
            System.out.print("*");
        }
    }
}
