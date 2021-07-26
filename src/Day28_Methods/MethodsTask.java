package Day28_Methods;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class MethodsTask {
    public static void main(String[] args) {

        PrintOddFrom1_100(1, 100);

        evenNumbers1_100(1, 100);

       age(1997, 2021);

        eligibleToVote(18, true );

        calculate(100, '+', 200 );
    }


//********************PRINT ODD NUMBERS FROM 1-100***************************
    public static void PrintOddFrom1_100(int from, int to ) {

        for (int i = from; i <= to; i++) {//1,2,3,4,5,6.....100
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }

        }
        System.out.println();
        System.out.println("------------------------------------------------------");
    }



    //******************PRINT EVEN NUMBERS FROM 1-100*********************
    public static void evenNumbers1_100(int from, int to) {
        for (int i = from; i <= to; i++) {//1,2,3,4,5,6.....100
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("------------------------------------------------------");
    }



    //*****************PRINT AGE*************************
    public static void age(int yearOfBirth, int currentYear){
        System.out.println("Your age is "+(2021-yearOfBirth));
        System.out.println();
        System.out.println("------------------------------------------------------");

    }



    //*************ELIGIBLE TO VOTE**********************
    public static void eligibleToVote( int age, boolean isUSCitizen){

        if (age>=18 && isUSCitizen){
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Not eligible");
        }
        System.out.println();
        System.out.println("------------------------------------------------------");

    }



    public static void calculate(int num1, char operator, int num2 ){//+,-,*,/,%

        switch (operator){
            case'-':
                System.out.println("Subtraction: " + (num1 - num2));
                break;

            case '+':
                System.out.println("Addition: " + (num1 + num2));
                break;

            case '*':
                System.out.println("Multiplication: " + (num1 * num2));
                break;

            case '/':
                System.out.println("Division: " + (num1 / num2));
                break;

            case '%':
                System.out.println("Remainder: " + (num1 % num2));
                break;

            default:
                System.out.println("Invalid Operator");
        }
        }
    }



/*
task:
    1. create a method that can print odd numbers between 1~100
     in a same line seperated by space

    2. create a method that can print even numbers between 1~100

    3. create a method that can calculate the age of the person

    4. check eligibility to vote
 */