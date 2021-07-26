package day09_ifStatements;

public class MaximunNumber {

    public static void main(String[] args) {

        int numb1 = 20;
        int numb2 = 30;

        if (numb1 > numb2) {
            System.out.println(numb1 + " is a maximum");
        }
        if (numb2 > numb1) {

            System.out.println(numb2 + " is a maximum");
        }
        System.out.println("--------------------------");

        if (numb1 > numb2) {
            System.out.println(numb1 + " is a minimum");

        }
        if (numb2 > numb1) {
            System.out.println(numb2 + " is a maximum");

        }

    }
}
/*
1. write a program that can print out the maximum number between two different numbers
            Ex:
                num1 = 20;
                num2 = 30;

            output:
                    30 is the maximum number
 */