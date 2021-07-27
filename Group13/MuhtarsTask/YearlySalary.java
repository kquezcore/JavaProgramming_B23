

import java.util.Scanner;



public class YearlySalary {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double salary = 50000;
        int creditScore = 550;
        String loan = "";


        if (salary >= 60000) {
            loan = "Approved";
        } else if (creditScore >= 650) {
            loan = "Approved";
        } else {
            loan = "Denied";
        }
        System.out.println("loan = " + loan);
        System.out.println("----------------------------------------------------------");

        String Loan2 = (salary >= 60000 && creditScore >= 650) ? "Approved " : "Denied";

        System.out.println("Loan2 = " + Loan2);
    }

}



/*

1. Given two values: yearly salary and credit score determine if you can get a loan.

                To be approve for the loan, print: "Loan Approved":
                        Salary: above 60,000
                        Credit Score: above 650
                    Otherwise print: "Loan Denied"
             NOTE: MUST APPLY TERNARY

 */