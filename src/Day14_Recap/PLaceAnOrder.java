package Day14_Recap;

import java.util.Scanner;

public class PLaceAnOrder {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter product name");
        String productName = scan.nextLine();// enter

        System.out.println("Enter the price");
        double price = scan.nextDouble();//enter

        System.out.println("Enter the quantity:");
        int quantity = scan.nextInt();//4

        double totalprice = price*quantity;

        scan.nextLine();
        System.out.println("Enter your Full name:");
        String fullName = scan.nextLine();

        scan.close();// closes the scanner
        // we cannot use scanner object after this line

        System.out.println(fullName+" your order for "+quantity+" "+productName+ "has been placed. your total is: "+totalprice);

        System.out.println("Enter your age");
        int age = scan.nextInt();
        System.out.println("age = " + age);
    }
}
/*

Warmup tasks:
    1. PlaceAnOrder task:
                Ask User to enter the prodcut name (multiple Strings_3.words)
                Ask the user to enter the price  (double)
                Ask the user to enter the quantity (int)
                Ask the user to enter their first name (String, single word)

            Print in the following format:
                Ex:
                    Input: "Apples" , 1.5, 5. "Luke"

                    Output:
                        Luke, your order for 5 Apples has been places. Your total is 7.5.
*/
