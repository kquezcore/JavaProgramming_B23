package Strings_3;

import java.util.Locale;
import java.util.Scanner;

public class Email2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        String firstName, lastName, domain;
        int underScore, atSign, dotIndex;

        underScore = email.indexOf("_");
        atSign = email.indexOf("@");
        dotIndex= email.indexOf(".");

        firstName= email.substring(0,underScore);
        firstName= firstName.substring(0,1).toUpperCase()+firstName.substring(1);

        lastName = email.substring(underScore+1,atSign);
        lastName = lastName.substring(0,1).toUpperCase()+lastName.substring(1);

        domain = email.substring(atSign+1,dotIndex);


        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);
        System.out.println("domain = " + domain);


    }
    }
/*
Write a program that will print out information about user based on email.
Print first name, last name, and domain. First and Last name should be printed
with proper format - uppercase first letter and remaining lowercase.

Example:

Input: craig_federighi@apple.com
Input: craig_federighi@apple.com
Output:
First name: Craig
Last name: Federighi
Domain: apple
 */