package Day14_Recap;

import java.util.Scanner;

public class ScannerPractice2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println(" Enter your zip code: ");
        long zipCode= scan.nextLong();

        System.out.println("How many people do you live with?");
        byte numberOfPeople = scan.nextByte();

        System.out.println("are you married?");
        boolean isMarried = scan.nextBoolean();

        System.out.println("I see you are "+((isMarried)?"Married":"Not Married") +"and live with "+numberOfPeople+ "people in the ");
    }
}
