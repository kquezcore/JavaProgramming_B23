package Day10_IfStatements;

public class DaysOfWeek {

    public static void main(String[] args) {
        int numberOfDay = 4;
        String name = "";

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
        System.out.println("name = " + name);
}

}
