package Variables_1;

import java.util.Scanner;

public class VariablePhoneNumber {
    public static void main(String[] args){

        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // Variables are already declared and given
        Scanner scan=new Scanner(System.in);
        int areaCode=scan.nextInt();
        int localNumber=scan.nextInt();

        String phoneNumber;

        //WRITE YOUT CODE HERE:
         phoneNumber = "Calling number " +"("+ areaCode+")" +"-"+ localNumber;
        System.out.println( phoneNumber);


//Write a program that asks user to input int values: areaCode and localNumber.
//
//Using concatenation put together in this format and assign to String phoneNumber variable:
//(222)-3334444
//
//Write a print statement that displays (use the phoneNumber variable ):
//Calling number (222)-3334444






    }

}
