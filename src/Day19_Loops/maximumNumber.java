package Day19_Loops;

import java.util.Scanner;

public class maximumNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max= -2147483648;//WHATEVER USER ENTERS IT WILL BE LARGER THAN THIS.

        for (int i = 0; i <5 ; i++) {
            System.out.println("Enter a number:");
            int n = scan.nextInt();// 10,15,20,30,5

            if (n > max){// if the Users entered number is greater than the max value
                max = n;// then user entered number will be assigned to max variable
            }

        }
        System.out.println("max = " + max);

    }
}
/*

//	7. ask user to enter a number for 5 times,  then return the maximum number
//
//	8. ask user to enter a number for 5 times,  then return the minimum number
 */