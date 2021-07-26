package Statements_2;

import java.util.Scanner;

public class tipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String splitOrNot= scan.next();

        int numberOfPeople = scan.nextInt();
        double checkAmount = scan.nextDouble();
        String QualityOfService= scan.next();
        double tipPercent=0.0;
        double totalTip=0.0;
        double totalToPay= 0;
        double totalPerPerson=1.0;
        double tipPerPerson=1.0;


        switch (QualityOfService){
            case "Poor":
                tipPercent=0.05;
                totalTip=checkAmount*tipPercent;
                break;
            case "Fair":
                tipPercent=0.10;
                totalTip=checkAmount*tipPercent;
                break;
            case "Good":
                tipPercent=0.15;
                totalTip=checkAmount*tipPercent;
                break;
            case "Great":
                tipPercent=0.20;
                totalTip=checkAmount*tipPercent;
                break;
            case "Excellent":
                tipPercent=0.25;
                totalTip=checkAmount*tipPercent;
                break;
            default:
                tipPercent=0;
        }


        totalToPay= checkAmount+totalTip;


        if (splitOrNot.equals("Yes")){
            totalPerPerson=totalToPay/numberOfPeople;
            tipPerPerson=totalTip/numberOfPeople;
        }else {
            totalPerPerson=totalToPay;
            tipPerPerson=totalToPay;
        }

        System.out.println("Split:\n" +
                "Number of people:\n" +
                "Check amount:\n" +
                "Service Quality:");

        System.out.print("Number of people entered: ");
        for (int i = 0; i<numberOfPeople; i=i+1){
            System.out.print("&");
        }
        System.out.println();
        System.out.println("Total to pay: "+totalToPay);
        System.out.println("Total tip: "+totalTip);
        System.out.println("Total per person: "+totalPerPerson);
        System.out.println("Tip per person: "+tipPerPerson);



    }
}
/*

Write a program for a tip calculator.
 There will be different service quality benchmarks that will determine the tip given.
  There will also the ability to calculate based on the number of people in the party
   and if there is a split of the bill or not.

Poor = 5% Fair = 10% Good = 15% Great = 20% Excellent = 25%

The program should display the following information based on the user input:

Split or No split (Yes or No) Number of people entered: (number)
 (each person = & in output) Check amount: (number) Service Quality:
  (String) Total to pay: Total tip: Total per person: Tip per person:

Example
Input:
Yes
4
476.0
Excellent

Output:
Number of people entered: &&&&
Total to pay: 595.0
Total tip: 119.0
Total per person: 148.75
Tip per person: 29.75
 */