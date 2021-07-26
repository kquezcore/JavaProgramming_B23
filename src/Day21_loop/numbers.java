package Day21_loop;

import java.util.Scanner;

public class numbers {

    //********* TO PRINT THE NUMBERS THAT DIVISIBLE BY ********************

    public static void main(String[] args) {
        System.out.println("Enter a number");
        int n = new Scanner(System.in).nextInt();

        if (n<0){
            System.out.println("Invalid Number");
            System.exit(0);
        }

        String result1= "Divisible by 15: ";
        String result2= "Divisible by 5: ";
        String result3 = "Divisible by 3:";


        for (int i = 0; i <=n ; i++) {

           if (i % 15 == 0){
                result1 += i+" ";
            }
           if (i % 5 == 0) {
               result2 += i + " ";
           }
           if (i % 3 == 0){
            result3 += i+" ";
           }
        }
        System.out.println( result1);
        System.out.println(result2);
        System.out.println( result3);
    }


}
/*

 */