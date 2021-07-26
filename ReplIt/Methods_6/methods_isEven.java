package Methods_6;

import java.util.Scanner;

public class methods_isEven {
    public static boolean isEven(int n) {

        boolean isEven;

        if (n%2==0){
            isEven=true;
        }else{
            isEven=false;
        }
     return isEven;
    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isEven(in.nextInt()));
    }

}
/*
isEven accepts a number and checks if it is even.
 If the given number is even return true, otherwise return false.

Examples:

isEven(1) --> false
isEven(1) --> false
isEven(8) --> true
 */