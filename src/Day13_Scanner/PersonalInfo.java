package Day13_Scanner;

import java.util.Scanner;

public class PersonalInfo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your salary");
        int salary = scan.nextInt();// only takes the first word


        System.out.println("Enter Your Gender");
        String gender= scan.next();

        scan.nextLine();
        System.out.println("Enter your full name:");
        String fullName = scan.nextLine();


        System.out.println("Enter your job title");
        String jobTitle= scan.nextLine();


        System.out.println("salary = " + salary);
        System.out.println("gender = " + gender);
        System.out.println("fullName = " + fullName);
        System.out.println("jobTitle = " + jobTitle);


    }
}
/*
salary
gender
 full name

 */