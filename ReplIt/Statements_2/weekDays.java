package Statements_2;

import java.util.Scanner;

public class weekDays {

    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // Variables are already declared and given
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        int day = scan.nextInt();

        //WRITE YOUR CODE HERE
        if (day == 1){
            System.out.println("Monday");
        }else if (day ==2){
            System.out.println("Tuesday");
        }else if (day ==3){
            System.out.println("Wednesday");
        }else if (day == 4){
            System.out.println("Thursday");
        }else if (day==5){
            System.out.println("Friday");
        }else if (day == 6){
            System.out.println("Saturday");
        }else if (day ==7 ){
            System.out.println("Sunday");
        }else {
            System.out.println("Not a valid day");
        }




    }
}
