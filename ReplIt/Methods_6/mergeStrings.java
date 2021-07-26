package Methods_6;


import java.util.Scanner;

public class mergeStrings {

    public static String mergeStrings(String one, String two) {
// To store the final string
        StringBuilder result = new StringBuilder();

        // For every index in the strings
        for (int i = 0; i < one.length() || i < two.length(); i++) {

            // First choose the ith character of the
            // first string if it exists
            if (i < one.length())
                result.append(one.charAt(i));

            // Then choose the ith character of the
            // second string if it exists
            if (i < two.length())
                result.append(two.charAt(i));
        }

        return result.toString();
    }




    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println(mergeStrings(in.next(), in.next()));
    }

}

