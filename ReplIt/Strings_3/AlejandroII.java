package Strings_3;

import java.util.Scanner;

public class AlejandroII {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();

        //your code here
        if ((a.contains("Alejandro") || a.contains("alejandro")) && (a.equalsIgnoreCase("project"))) {
            System.out.println("read");

        } else {
            System.out.println("don't read");

        }
    }
}

/*
Alejandro has many emails and only has time to read the emails that refer to him and a project.
Check if his name is found in the email and if project is also included and if it does print "read",
but if his name is not in the email print "don't read"

Example:

a = "dear alejandro.....alot of text"

output: "don't read"
a = "dear alejandro.....alot of text"

output: "don't read"
a = "thunder blaz is the best drink in the galaxy..."

output: "don't read"
a = "thunder blaz is the best drink in the galaxy..."

output: "don't read"
a = "subject : important project, alejandro we refer to you  this ...."

output: "read"
 */