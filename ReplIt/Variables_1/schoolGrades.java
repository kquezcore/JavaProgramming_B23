package Variables_1;

import java.util.Scanner;

public class schoolGrades {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Grader!");
        System.out.println("Please enter subject name number 1 and score for this subject");
        String subject1 = input.next();
        double score1 = input.nextDouble();

        System.out.println("Please enter subject name number 2 and score for this subject");
        String subject2 = input.next();
        double score2 = input.nextDouble();

        System.out.println("Please enter subject name number 3 and score for this subject");
        String subject3 = input.next();
        double score3 = input.nextDouble();

        System.out.println("Please enter subject name number 4 and score for this subject");
        String subject4 = input.next();
        double score4 = input.nextDouble();

        System.out.println("Please enter subject name number 5 and score for this subject");
        String subject5 = input.next();
        double score5 = input.nextDouble();

        double averageScore = (score1 + score2 + score3 + score4 + score5) / 5;

        System.out.println("Summary: " + subject1 + " - " + score1 + ", " + subject2 + " - " + score2 + ", " +
                subject3 + " - " + score3 + ", " + subject4 + " - " + score4 + ", " + subject5 + " - " + score5 + "\n" +
                "Your average score is: " + averageScore + "\n" + "Thank you for using Grader!" + "\n" +
                "Goodbye!");

    }
}