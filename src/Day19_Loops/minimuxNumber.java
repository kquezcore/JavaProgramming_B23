package Day19_Loops;

import java.util.Scanner;

public class minimuxNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int min= 2147483647;//WHATEVER USER ENTERS IT WILL BE SMALLER THAN THIS.

        for (int i = 0; i <5 ; i++) {// will be excecuted 5 times
            System.out.println("Enter a number:");
            int n = scan.nextInt();// 10,15,20,30,5

            if (n < min){// if the Users entered number is greater than the min value
                min = n;// then user entered number will be assigned to min variable
            }

        }
        System.out.println("min = " + min);
    }
}

//
//	8. ask user to enter a number for 5 times,  then return the minimum number