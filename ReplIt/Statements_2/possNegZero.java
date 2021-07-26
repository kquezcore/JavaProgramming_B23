package Statements_2;

import java.util.Scanner;

public class possNegZero {
    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // Variables are already declared and given
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        //Write your code
        if (num >0) {
            System.out.println(" Positive");
        }
        if (num <0) {
            System.out.println(" Negative");
        }
        if (num == 0) {
            System.out.println("Zero");
        }

    }
}




//num  = 1
//
//positive
//```
//
//```
//num = -6
//
//negative
//```
//
//```
//num = 0
//
//zero
//```