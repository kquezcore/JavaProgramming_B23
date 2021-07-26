package day09_ifStatements;

public class weekAndMonths {
    public static void main(String[] args) {
        int numberOfDay = 5;

        if (numberOfDay == 1){
            System.out.println("Monday");
        }

        if (numberOfDay == 2){
            System.out.println("Tuesday");
        }

        if (numberOfDay==3) {
            System.out.println("Wednesday");
        }

        if (numberOfDay == 4){
            System.out.println("Thursday");
        }

        if (numberOfDay == 5){
            System.out.println("Friday");
        }

        if (numberOfDay==6) {
            System.out.println("Saturday");
        }

        if (numberOfDay == 7){
            System.out.println("Sunday");
        }
        System.out.println("---------------------------");

        int numberOfMonth = 5;

        if (numberOfMonth==1){
            System.out.println("January");
        }
        if (numberOfMonth==2){
            System.out.println("February");
        }
        if (numberOfMonth==3){
            System.out.println("March");
        }
        if (numberOfMonth==4){
            System.out.println("April");
        }
        if (numberOfMonth==5){
            System.out.println("May");
        }
        if (numberOfMonth==6){
            System.out.println("June");
        }
        if (numberOfMonth==7){
            System.out.println("July");
        }
        if (numberOfMonth==8){
            System.out.println("August");
        }
        if (numberOfMonth==9){
            System.out.println("September");
        }
        if (numberOfMonth==10){
            System.out.println("October");
        }
        if (numberOfMonth==11){
            System.out.println("November");
        }
        if (numberOfMonth==12){
            System.out.println("December");
        }
    }
}


/*
Tasks:
    1. write a program that can print the name of day based on the number 1 ~ 7
            ex: number = 5;

                output:
                    Friday

    2. name of the month based on the  number 1 ~ 12
            ex:
                month = 3

                output:
                    March
 */