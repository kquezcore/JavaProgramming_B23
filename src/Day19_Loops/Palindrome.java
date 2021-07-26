package Day19_Loops;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        //racecar

        String word =  new Scanner(System.in).next();
        String reverseWord="";

        for (int i = word.length()-1; i >=0 ; i++) {
            reverseWord += word.charAt(i);
        }
        boolean isPalindrome= word.equalsIgnoreCase(reverseWord);// in order to know if its palindrome or not. in reverse word.

        System.out.println("isPalindrome = " + isPalindrome);
    }

}
