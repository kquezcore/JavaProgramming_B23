package Day16String;

import java.util.Scanner;

public class StringPractice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two Strings_3.words;");
        String word1 = scan.next();
        String word2 = scan.next();

        if(word1.length()>=2 && word2.length()>=2) {
            String result = word1.substring(1) + word2.substring(1);
            System.out.println(result);
        }else{
            System.out.println("Too Short");
        }

        scan.close();

       /* 2. Ask user to enter two Strings_3.words. Print first word without its first character then print the second word without its first character.
        Input:
        apple
                banana
        Output:
        ppleanana


        */


    }
}
