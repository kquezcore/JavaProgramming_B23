package MuhtarsTask;

public class AgeGroup {

    public static void main(String[] args) {
        int age = 4;

        if (age < 3) {
            System.out.println("Infant");
        } else if (age <= 5) {
            System.out.println("Toddler");
        } else if (age <= 9) {
            System.out.println("Kid");
        } else if (age <= 12) {
            System.out.println("Pre-Teen");
        } else if (age <= 17) {
            System.out.println("Teeneger");
        } else if (age <= 20) {
            System.out.println("Young Adult");
        } else if (age <= 39) {
            System.out.println("Adult");
        } else if (age <= 49) {
            System.out.println("Young Middle-Aged Adult");
        } else if (age <= 54) {
            System.out.println("Middle Aged Adult");
        } else if (age <= 64) {
            System.out.println("Very Young Senior Citizen");
        } else if (age <= 74) {
            System.out.println("Young Senior Citizen");
        } else if (age <= 84) {
            System.out.println("Senior Citizen");
        } else {
            System.out.println("Old Senior Citizen");
        }


        System.out.println("----------------------------");


        if(age < 3){
            System.out.println("infant");
        }else if(age>=3 && age<=5){
            System.out.println("Toddler");
        }else if(age>=6 && age<=9){
            System.out.println("Kid");
        }else if(age>=10 && age<=12){
            System.out.println("Pre-Teen");
        }else if(age>=13 && age<=17){
            System.out.println("Teenager");
        }else if(age>=18 && age<=20){
            System.out.println("Young Adult");
        }else if(age>=21 && age<=39){
            System.out.println("Adult");
        }else if(age>=40 && age<=49){
            System.out.println("Young Middle-Aged Adult");
        }else if(age>= 50 && age<=54){
            System.out.println("Middle Aged adult");
        }else if(age>=55 && age<=64){
            System.out.println("Very Young Senior Citizen");
        }else if(age>=65 && age<=74){
            System.out.println("Young Senior Citizen");
        }else if(age>=75 && age<=84){
            System.out.println("Senior Citizen");
        }else {
            System.out.println("Old Senior Citizen");
        }
    }
}

/*
1. write a program that can define the age groups of a person
                 age groups are:
                        infant ( < 3 year)
                        Toddler (3 - 5),
                        Kid (6 - 9),
                        Pre-Teen (10 - 12),
                        Teenager (13 - 17),
                        Young Adult (18 - 20),
                        Adult (21 - 39),
                        Young Middle-Aged Adult (40 - 49),
                        Middle-Aged Adult (50 - 54),
                        Very Young Senior Citizen (55 - 64),
                        Young Senior Citizen (65 - 74),
                        Senior Citizen (75 - 84),
                        Old Senior Citizen (85+)


 */

