package Statements_2;

import java.util.Scanner;

public class consoleMenu {

    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // Variables are already declared and give
        Scanner s = new Scanner(System.in);

        System.out.println("---------------");
        System.out.println("select an option:");
        System.out.println("1) option 1");
        System.out.println("2) option 2");
        System.out.println("3) option 3");
        System.out.println("---------------");

        int choice = s.nextInt();

        //Write your code here:

        if (choice == 1) {
            System.out.println("user selected 1");
        } else if (choice == 2) {
            System.out.println("user selected 2");
        } else {
            System.out.println("user selected 3");
        }
    }
    }
