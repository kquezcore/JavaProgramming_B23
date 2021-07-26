package Day19_Loops;

import java.util.Scanner;

public class RemoveDuplicateFromString {
    public static void main(String[] args) {

        String word = "abababababchbbbbbbbbbbbaaaaaaaaaaaaaccccccccccccc";

        String result = "";//abc
// word.length()-1 to find the last index of the word

        for (int i = 0; i <= word.length()-1 ; i++) {

            if (!result.contains(""+ word.charAt(i))){// if the character is not contained in the result
                result += word.charAt(i);// then add the character to the result
            }

        }
        System.out.println("result = " + result);
    }
}