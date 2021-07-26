package Day17_String;

import java.util.Scanner;

public class validWebsite {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please, enter your website:");
        String website = scan.nextLine();

        boolean validWebsite = website.startsWith("www.")
                && (website.endsWith(".com") || website.endsWith(".edu") ||website.endsWith(".gov") );
        if (validWebsite = true) {
            System.out.println("is valid website");
        } else {
            System.out.println("is invalid website");
        }
    }
}

/*

2. write a program that can check if the given website is valid website or not
            starts with: www.
            ends with: .com, .edu, .gov

 */
