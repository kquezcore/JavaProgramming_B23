package Day10_IfStatements;

public class CampusHours {
    public static void main(String[] args) {
        int time = 7;
        String result = "";


        if (time >= 8 && time <= 23) {
           // System.out.println("Open");
            result = "Open";
        } else {
           // System.out.println("closed");
            result = "Closed";
        }
        System.out.println("result ="+ result);
    }
}
/*
1. Campus time: User enters a time(hour in 24 hour format) and will be able to find out if the campus is open or not.
            Campus is open from 8 am(8) to 11 pm (23) If user enters a time within the open time they should see message: “open”
            but if the time entered is outside of operating hours they should see: “ closed”


 */