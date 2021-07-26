package Arrays_5;

import java.util.Arrays;
import java.util.Scanner;

public class Array_SplitEmail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String email = input.nextLine();

        //Write your code below



        String[] arrays =  email.split("@"); //{James, gmail.com}
        if (!email.contains("@")||arrays.length>2){
            System.out.println("invalid email");
        }else{
            String id = arrays[0];
            System.out.println("Email id: " + id);
            System.out.println("Email domain:"+arrays[1]);

        }


    }
}

/*
Given a String variable email, write code using split method to print email id and domain in separate lines.

Example:

email -> info@cybertekschool.com

Output:
Email id: info
Email domain: cybertekschool.com
email -> info@cybertekschool.com

If email contains no @ character or multiple @ characters then print invalid email:

email -> hello-gmail.com

Output:
invalid email

email -> my@fancy@email.com

Output:
invalid email
 */