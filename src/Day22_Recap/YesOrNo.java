package Day22_Recap;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.Locale;
import java.util.Scanner;

public class YesOrNo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Will you marry me?");
        String answer = scan.next().toLowerCase();

        while (!(answer.equals("yes") || answer.equals("no"))) { //to make sure user enters either yes or no
            System.out.println("Invalid Entry, please re-enter");
            answer = scan.next().toLowerCase();
        }

        if (answer.equals("yes")) {
            System.out.println("Congrats");
        } else {
            System.out.println("RIP");
        }

        scan.close();

    }
}

/*
. Write a program for the  marriage proposal program asking the user,
 "Will you marry me?"
    if the answer is yes, print "Congrats."
    if the answer is neither yes nor no, print "Invalid answer, please re-enter"
     and repeat it until the user enters either yes or no
 */