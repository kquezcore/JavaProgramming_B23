package Day10_IfStatements;

public class DaysOfWeek2 {

    public static void main(String[] args) {
        int number = 34;
        String name = "";


        if (number >= 1 && number <= 7) {

            name = (number == 1) ? "Monday" : (number == 2) ? "Tuesday" : (number == 3) ? "Wed" : (number == 4) ? "thursday"
                    : (number == 5) ? "Friday" : (number == 6) ? "saturday" : "Sunday";
        } else {
            name = "no such day";
        }

        System.out.println("name = " + name);
    }
}
/*
            if (numberOfDay == 1) {
                name = "Monday";
            } else if (numberOfDay == 2) {
                name = "Tuesday";
            } else if (numberOfDay == 3) {
                name = "Wednesday";
            } else if (numberOfDay == 4) {
                name = "Thursday";
            } else if (numberOfDay == 5) {
                name = "Friday";
            } else if (numberOfDay == 6) {
                name = "Saturday";
            } else {
                name = "Sunday";
            }

        }else {
            name = "No Such A Day";


        }
        System.out.println("name = " + name);
*/



