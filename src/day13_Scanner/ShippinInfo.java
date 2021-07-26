package day13_Scanner;

import java.util.Scanner;

public class ShippinInfo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your Building Number: ");
        int buildingNumber = scan.nextInt();

        scan.nextLine();
        System.out.println("Enter your street address: ");
        String streetAddress = scan.nextLine();

        System.out.println("Enter your city Name: ");
        String cityName = scan.nextLine();

        System.out.println("Enter your state name: ");
        String stateName = scan.next();

        scan.nextLine();
        System.out.println("Enter your zip code: ");
        String zipCode = scan.next();

        scan.nextLine();
        System.out.println("Enter your full name: " );
        String fullName= scan.nextLine();

        String shippingInfo = fullName+ "\n"+ buildingNumber+ " "+ streetAddress+ " "+ cityName+ " "+ stateName+ " "+ zipCode;
        System.out.println( shippingInfo);



    }
}
/*

ask for the following
building number-nextInt
street address -nextline
city name- nextLine
state - next
zipcode -next
persons full name- next line
 p

 print out the shipping info of the person


 ex

 Aysu Ahmadli
 7ndfjw ewjfw wvhwv dsh
 mean ba 22012
 */