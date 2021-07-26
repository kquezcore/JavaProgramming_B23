package Day14_Recap;

import java.util.Scanner;

public class numberOfDigits {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a number between 1 to 100000:");
        int n = scan.nextInt();
        String result= "";

        if (n >=1 &&n<=100000) {//if number is valid

            if (n <= 9) {
                result="1 digit";
            } else if (n <= 99) {//  false :n>99
            result  = "2 digits";
            }else if (n<=999){
                result="3 digits";
            }else if (n<=9999){
                result = "4 digits";
            }else if (n<=99999){
               result = "5 digits";
            }else if (n<=999999){
                result= "6 digits";
            }

        }else{
            result = "Invalid number";
        }
       // String result2= (n>1&&n<=999999)?(n<=9)? "1 digit": (n<=99)? "2 digits"
         //       :(n<=999)? "3 digits" :(n<= 9999)? "4 digits" :(n<=99999)? "5 digits" :(n<=999999)? "6 digits" :"Invalid Character");


    }
}
