package Day20_Loops;

import java.util.Scanner;

public class NegativeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int result=0;

        for (int i=0; i==0;) {
            System.out.println("Enter a number:");
            int n= scan.nextInt();

            if (n <0){//if user entered a negative number
                break;//exits the loop
            }
            result += n;// if the number is not negative
        }
        System.out.println(result);
    }

}
/*
4. Write a program that calculates the sum of numbers entered
by the user until user enters a negative number.

            hint: you need an infinite loop

 */