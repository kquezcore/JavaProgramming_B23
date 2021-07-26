package Day19_Loops;

import java.util.Scanner;

public class sumOf10Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int result= 0;

        for (int i = 1; i <=10 ; i++) {// if we wanna get the result of the sum of 10 numbers
            System.out.println("Enter a number:");
            result+= scan.nextInt();
        }

        System.out.println("result= "+result);
    }
}
//
//	6. ask user to enter a number 10 times . find the sum of 10 numbers
//


//	7. ask user to enter a number for 5 times,  then return the maximum number
//
//	8. ask user to enter a number for 5 times,  then return the minimum number