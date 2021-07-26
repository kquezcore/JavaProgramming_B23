package Day14_Recap;

import java.util.Scanner;

public class GradeLevel {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your grade number:");
        byte number = scan.nextByte();

        String gradeLevel= "";


        if (number>=1 && number <= 18){
            gradeLevel= (number <=5)? "Elementary school":(number >=6&& number <=8)?"Middle school"
                    :(number<=12)?"High school" :(number <=16)?"college":"Grad school";


        }else {// if invalid
            gradeLevel = "Invalid";
        }
        System.out.println("gradeLevel = " + gradeLevel);


    }
}
/*
lunch:
        Given a number(byte) grade level determine and print which school type someone is in.
        grade level and types are:
        1-5: Elementary school
        6-8: Middle school
        9-12: High school
        13-16: College
        17-18: Grad School
        Other: Invalid grade level given


        Switch:
        Ask the user how many people they live with?
        if user lives with Less than 3 people: print "Live with less than 3 people"
        if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
        if the user lives with more than 6 people: print "Live with "more than 6 people"
*/
