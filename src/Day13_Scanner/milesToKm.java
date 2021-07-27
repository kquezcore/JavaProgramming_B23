package Day13_Scanner;

import java.util.Scanner;

public class milesToKm {

    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
        System.out.println("Enter Miles");
        double miles = scan.nextDouble();
        double km=miles*1.609;
        if(miles>=0) {
            System.out.println(miles + " miles equal to " + km + " kilometres");
        }else {
            System.err.println("Invalid");
        }





    }
}
/*
2. Write a program that can convert Miles to KM
            Ex:
             1 mile = 1.609
                Enter miles:
                10.0

                output:
                10.0 miles equal to 16.09 kilometers

 */