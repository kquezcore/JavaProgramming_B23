package Strings_3;

import java.util.Scanner;

public class GetASandwich {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

                String message = "";

                if (str.indexOf("bread") != str.lastIndexOf("bread")) {
                    message = str.substring(str.indexOf("bread") + 5, str.lastIndexOf("bread"));

                } else {
                    message = "nothing";
                }
                System.out.println(message);

            }
        }


/*
A sandwich is two pieces of bread with something in between.
 Print the string that is between the first and last appearance of "bread"
 in the given string, or return string "nothing" if there are not two pieces of bread.

Example:

input: breadjambread

output: jam
input: breadjambread

output: jam
input: xxbreadjambreadyy

output: jam
input: xxbreadjambreadyy

output: jam
input: xxbreadapple

output: nothing
input: xxbreadapple

output: nothing
input: breadbutterbread

output: butter
 */