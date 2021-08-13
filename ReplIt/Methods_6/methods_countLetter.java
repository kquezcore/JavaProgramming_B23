package Methods_6;

import utilities.ArraysUtility;

import java.util.Scanner;

public class methods_countLetter {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(countLetters(in.next()));
    }

    public static String countLetters(String str){

        String removeDuplicate="";
        for (int i = 0; i <str.length() ; i++) {

            if (!removeDuplicate.contains(""+str.charAt(i))){
                removeDuplicate+=str.charAt(i);
            }
        }

        String result="";
        for (int j = 0; j <removeDuplicate.length() ; j++) {
        char ch= removeDuplicate.charAt(j);
        int frequency=0;
            for (int i = 0; i <str.length() ; i++) {
                if (ch == str.charAt(i)) {
                    frequency++;
                }
            }
            result+= frequency+" "+ch;

            }
        return result;
        }





}




/*
Write a method countLetters that can count letters in a given string and return a new string in the given format:


number of letters + letter
Example:

input: countLetters("aaabbcccc");

output: "3a2b4c"
 */
