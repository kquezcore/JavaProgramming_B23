package Day16String;

import java.util.Scanner;

public class StringPratice4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter three Strings_3.words");
        String word1 = scan.next();
        String word2 = scan.next();
        String word3 = scan.next();
        scan.close();

        boolean allSame = word1.length() == word2.length() && word1.length() == word3.length();
        boolean notSame = !allSame && word2.length() != word3.length();
        String message = "";

        if (allSame) {
            message = "All word are the same length";
        } else if (notSame) {
            message = "All different length";
        } else {
            message = "Not Same nor Different lengths";
        }
        System.out.println(message);
    }
}
