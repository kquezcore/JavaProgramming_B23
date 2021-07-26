package Statements_2;

import java.util.Scanner;

public class OddOrEven {

        public static void main(String[] args) {
            //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
            // Variables are already declared and given
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a number:");
            int number = input.nextInt();

            //WRITE YOUR CODES HERE:

            boolean even = number %2==0;
            if (even){
                System.out.println(number + " is even");
            }
            if (!even){
                System.out.println(number+ " is odd");
            }else{
                System.out.println(number+ " zero");

            }







        }

}
