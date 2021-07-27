package Day13_Scanner;

import java.util.Scanner;

public class FreeShipping {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the rice of item: ");
        double price= scan.nextDouble();

        System.out.println("are you a prime member?");
        boolean isPrime = scan.nextBoolean();

        double totalCost = (isPrime || price>=25)? price: price  + 3.99;

        System.out.println("totalCost = " + totalCost);
    }
}
