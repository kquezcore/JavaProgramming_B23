package Day15_String;

import java.util.Scanner;

public class Initials {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name:");
        char f = scan.next().charAt(0);

        System.out.println("Enter your last name:");
       char l = scan.next(). charAt(0);

        /*
        char f = firstName.charAt(0);
        char l = lastName.charAt(0);

         */

        String initial = f+ "."+l;

        System.out.println("initial = " + initial);






    }
}
