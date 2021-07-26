package Day34_LocalDateTime_Wrapper;

import java.time.LocalDate;


public class Birthday {


    public static void main(String[] args) {
        birthday(1995,7,22);
    }

    public static void birthday(int year, int month, int day ){
        LocalDate DOB= LocalDate.of(year, month, day);
        LocalDate today= LocalDate.now();

        int age= today.getYear()-DOB.getYear();


        if (DOB.getMonthValue()== today.getMonthValue()&& DOB.getDayOfMonth() == today.getDayOfMonth()){
            System.out.println("Happy Birthday");
            System.out.println("Today you are "+age+" years old!");
        }else{
            System.out.println("It's not your birthday!");
        }
    }



}
