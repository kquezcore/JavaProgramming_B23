package Day35_LocalDate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Task1 {



public static void main(String[]args){

    DateTimeFormatter DF =DateTimeFormatter.ofPattern("MMMM/dd, EEEE");


    LocalDate[]day={LocalDate.of(2021,07,23),
            LocalDate.of(2021,07,24),
            LocalDate.of(2021,07,25),
            LocalDate.of(2021,07,26),
            LocalDate.of(2021,07,27),
            LocalDate.of(2021,07,28),
            LocalDate.of(2021,07,29),
            LocalDate.of(2021,07,30),
            LocalDate.of(2021,07,31),
            LocalDate.of(2021,8,01)};



        for (int i = 0; i < day.length; i++) {
        System.out.println(day[i].format(DF));
     }
    }
}
/*
1. create an array of LocalDate and has the next 10 day's dates,
use for each loop to print each Date in the following formar:
                MonthName/Day, Day Name

                ex:
                    November/25, Wednesday
 */