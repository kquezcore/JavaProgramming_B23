package Methods_6;

import java.util.Scanner;

public class Methods_removeFirst {
    public static String removeFirst(String target) {

       String result = target.substring(1);
       return  result;


    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(removeFirst(in.next()));
    }

}

/*
The method accepts a string and returns a string without the first character

Example:

removeFirst("aaa")

returns "aa"
 */