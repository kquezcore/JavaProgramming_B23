package Day19_Loops;

import java.util.Scanner;

public class sumTasks {

    public static void main(String[] args) {

        /*
        4. write a program that can calculate the sum of all numbers between 1 to 100
        */
        int sum = 0;

        for (int i = 1; i < 100; i++) {
            sum += i;
        }
        System.out.println("sum= " + sum);

/*

5. write a program that can calculate the sum of all numbers between 1 to any given number
            ex:
                input: 100
                output: 5050

                input: 50
                output: 1275

                input : 200
                output : 20100
         */
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num= scan.nextInt();
        int summ= 0;

        for (int i = 1; i <= num; i++) {
            summ +=i;
        }
        System.out.println("sum = " + summ);
    }
}
