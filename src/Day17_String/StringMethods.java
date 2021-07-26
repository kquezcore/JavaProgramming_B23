package Day17_String;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String sentence= "My favorite programming languages are :C#, Java, JavaScript";
        boolean hasPython = sentence.contains("Python");
        boolean hasJava= sentence.contains("Java");

        System.out.println("hasPython = " + hasPython);
        System.out.println("hasJava = " + hasJava);

        System.out.println("-----------------------------------------------------");

        String sentence2="Cybertek School is the best";
        boolean startWithCybertek= sentence2.startsWith("Cybertek");
        boolean startsWithSchool= sentence2.startsWith("School");



        System.out.println("startWithCybertek = " + startWithCybertek);
        System.out.println("startsWithSchool = " + startsWithSchool);

        System.out.println("-----------------------------------------------------");

        boolean endsWithBest =  sentence2.endsWith("best");

        System.out.println("endsWithBest = " + endsWithBest);


    }

}
