package Day12_Scanner;

import java.util.Scanner;

public class DaysInWeek {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter the day of the Week: ");
        int number = input.nextInt();
        String result = "";

        if (number >= 1 && number <= 7) {

            result  = (number == 1) ? "Monday" : (number == 2) ? "Tuesday" : (number == 3) ? "Wed" : (number == 4) ? "thursday"
                    : (number == 5) ? "Friday" : (number == 6) ? "saturday" : "Sunday";
        } else {
            result = "no such day";
        }
        System.out.println("result = " + result);


        }

    }

