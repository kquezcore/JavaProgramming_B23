package Day15_String;

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Enter first number:");
        double num1= scan.nextDouble();

        System.out.println("Enter a math operator:");
        char mathOperator= scan.next().charAt(0);

        System.out.println("Enter second  number:");
        double num2= scan.nextDouble();


        double result=0;

        switch (mathOperator){
            case '-':
                result= num1-num2;
                break;
            case '+':
                result = num1 +num2;
                break;
            case'*':
                result = num1 * num2;
                break;

            case'/':
                result= num1/num2;



            default:
                System.out.println("Invalid Operator");

        }

        System.out.println("result = " + result);

        System.out.println("------------------");



        String s1= "Cybertek";

        int lastIndex = s1.length()-1;
        char firstChar =s1.charAt(0);

        char lastchar= s1.charAt(7);

        System.out.println("firstChar = " + firstChar);
        System.out.println("lastchar = " + lastchar);


        System.out.println("----------");

        String firstname= "Jonh";
        String lastName="king";

        String fullName= firstname + " "+ lastName;







    }
}
/*

number
math operator
number 2

ex:
10
+
20

output 30
 */