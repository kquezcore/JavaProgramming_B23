package Variables_1;

import java.util.Scanner;

public class PatientInfo {
    public static void main(String[] args) {
        //Enter your code here:
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the patient portal! \nPlease enter your personal information \nEnter your firstName");
        String firstName = scan.next();
        System.out.println("Enter your lastName");
        String lastName = scan.next();

        // this part is already provided DO NOT CHANGE
        System.out.println("Enter your email");
        String email = scan.next();

        scan.nextLine();//to capture Enter key press

        System.out.println("Enter your street");
        String street = scan.nextLine();

        // continue for city:
        System.out.println("Enter your city");
        String city = scan.nextLine();

        System.out.println("Enter your state");
        String state = scan.nextLine();

        System.out.println("Enter your zipcode");
        int zipCode = scan.nextInt();

        System.out.println("Enter your work phone number");
        long workPhoneNumber = scan.nextLong();

        System.out.println("Enter your personal phone number");
        long personalPhoneNumber = scan.nextLong();


        System.out.println("Enter your age");
        int age= scan.nextInt();

        System.out.println("Enter your height");
        double height = scan.nextDouble();

        System.out.println("Enter your weight");
        double weight = scan.nextDouble();

        System.out.println("Are you married?");
        boolean isMarried = scan.nextBoolean();

        String fullName =lastName+", "+firstName;
        String address= street+", "+city+", "+state+" "+zipCode;
        String contacts = "work phone number - "+workPhoneNumber+", "+"personal phone number - "+
                personalPhoneNumber+ ", email: "+email;


        System.out.println("Patient personal information");
        System.out.println("Full name: " + fullName);
        System.out.println("Address: " + address);
        System.out.println("Contacts: " + contacts);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight+" pounds");
        System.out.println("Married?: " + isMarried);

    }
    }
/*

declare 9 String variables firstName, lastName, fullName, email, street, state, city, address, contacts.

Declare 2 int variables: age, zipcode Declare 2 double variables: height, weight. Declare boolean variable:
 isMarried (for marriage status). Declare 2 long variables: workPhoneNumber and personalPhoneNumber.

Create a Scanner object named scan.

Execution flow with example:

Welcome to the patient portal!
Please enter your personal information
Enter your first name
James
Enter your last name
May
Enter your email
jamesmay@gmail.com
Enter your street
7925 Jones Branch Dr
Enter your city
McLean
Enter your state
VA
Enter your zip code
22102
Enter your work phone number
7896542314
Enter your personal phone number
2406542314
Enter your age
35
Enter your height
5.10
Enter your weight
173.2
Are you married?
true
Welcome to the patient portal!
Please enter your personal information
Enter your first name
James
Enter your last name
May
Enter your email
jamesmay@gmail.com
Enter your street
7925 Jones Branch Dr
Enter your city
McLean
Enter your state
VA
Enter your zip code
22102
Enter your work phone number
7896542314
Enter your personal phone number
2406542314
Enter your age
35
Enter your height
5.10
Enter your weight
173.2
Are you married?
true
build contacts variable by concatenating work phone, personal phone and email

build fullName variable by concatenating first name and last name

build address variable by concatenating street, city, state, zip code

Output in the console:

Patient personal information Full name: May, James Address: 7925 Jones Branch Dr, McLean, VA 22102
Contacts: work phone number - 7896542314, personal phone number - 2406542314,
 email: jamesmay@gmail.com Age: 35 Height: 5.1 Weight: 173.2 pounds Married?: true
 */