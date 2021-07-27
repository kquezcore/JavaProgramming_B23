package Day09_ifStatements;

public class DaysInMonth {

    public static void main(String[] args) {

        int month = 3;

        boolean has28Days= month ==2;
        boolean has30Days = month ==4 || month ==6 || month ==9 || month ==11;//in order to have 30 dys, the month needs to be april, june, sept, or november.
        boolean has31Days = month ==1 ||month ==3 || month ==5 ||month ==7 || month ==8 || month ==10||month == 12;

        boolean has31days= !has28Days &&!has30Days;


        if (has28Days){
            System.out.println("28 days");

        }
        if (has30Days){
            System.out.println("30 days");
        }

        if (has31Days){
            System.out.println("31 days");
        }
    }
}
