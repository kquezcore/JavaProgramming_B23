package Methods_6;

import java.util.Scanner;

public class Methods_SimpleCalculator {

    public static void main(String[] args) {
        plus();
    }

    // Do not touch above

    public static void plus(){

        //your code here
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your first number:");
        int a = scan.nextInt();
        System.out.println("Enter your second number:");
        int b = scan.nextInt();

        System.out.println("result: "+(a+b));




    }
}
/*
Implement the plus method. The return type is void and has no arguments.

The method should ask the user to input two numbers, then it will add them and print the result.

Hint: Create a scanner within plus method.

Example:

enter first number:
1
enter second number:
2
result: 3
 */