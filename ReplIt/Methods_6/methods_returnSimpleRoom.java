package Methods_6;

import java.util.Scanner;

public class methods_returnSimpleRoom {
    public static boolean simpleRoomBook(boolean isAvailable, int month, int day, int year) {
        // your code here

        boolean notAvailable = (day>=1 && day<=8)&&month==7&& year==2018;

        if(isAvailable==true && notAvailable!=true && year==2018){
            return true;
        }else{
            return false;
        }


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(simpleRoomBook(in.nextBoolean(), in.nextInt(), in.nextInt(), in.nextInt()));

    }
}
/*
To book a room first it needs to be available for rent and make sure its available at the date selected:

the room is already booked between 7/1/2018 - 7/8/2018 and not available
accepting bookings only for year of 2018
Example:

simpleRoomBook(false,2,1,2018)
return false

simpleRoomBook(true,2,1,2018)
return true

simpleRoomBook(true,7,2,2018)
return false
 */