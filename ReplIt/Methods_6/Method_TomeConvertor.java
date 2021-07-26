package Methods_6;

import java.util.Scanner;

public class Method_TomeConvertor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeConversion(scan.nextLine());
    }

    public static void timeConversion(String s) {
        /*
         * Write your code here.
         */

        String[] timeSplit = s.split(":");
        int hour = Integer.valueOf(timeSplit[0]);
        String hourConversion = "";
        if (timeSplit[2].contains("PM")) {
            if (hour == 12) {
                hourConversion = timeSplit[0];
            } else {
                hourConversion = hourConversion + (hour + 12);
            }
        } else {
            if (hour == 12) {
                hourConversion = hourConversion + "00";
            } else {
                hourConversion = timeSplit[0];
            }

        }
        timeSplit[0] = hourConversion;
        timeSplit[2] = timeSplit[2].substring(0, 2);
        String finalString = "";
        for (String each : timeSplit) {
            finalString = finalString + each + ":";
        }
        System.out.println(finalString.substring(0, finalString.length() - 1));
    }


}


/*
Given a time in 12 hour AM/PM format, convert it to military (24-hour) time.

Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock.
Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.

The timeConversion method should convert and print the given number (String argument)

Input: 07:05:45PM

Output: 19:05:45
Input: 07:05:45PM

Output: 19:05:45
Input: 07:15:55AM

Output: 07:15:55
 */