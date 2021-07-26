package Day17_String;

import java.util.Scanner;

public class gmailValid {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your email: ");
        String email=scan.nextLine();

        boolean validGmail=email.endsWith("@gmail.com");

        if (validGmail==true) {
            System.out.println(email + " is valid gmail");
        }else {
            System.out.println(email + " is not valid gmail");
        }


    }
}
/*

1. write a program to verify if the gmail is valid
            requirements:
                    a valid gmail account should end with @gmail.com
 */