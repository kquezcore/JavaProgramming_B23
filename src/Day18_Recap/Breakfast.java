package Day18_Recap;

import java.util.Locale;
import java.util.Scanner;

public class Breakfast {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word= scan.next();

        if (word.toLowerCase().startsWith("x")){
            System.out.println(word.substring(1));
        }else{
            System.out.println("Word");
        }


        scan.close();

    }
}
/*
1. Ask user to enter a word. If the work contains starts with x, print the word without x.
                    Input:
                        xcode
                    Output:
                        code
 */