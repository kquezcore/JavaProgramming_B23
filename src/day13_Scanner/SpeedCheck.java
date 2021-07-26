package day13_Scanner;

import java.util.Scanner;

public class SpeedCheck {
    public static void main(String[] args) {

        int speedLimit= 35;

        System.out.println("Enter your current speed: ");
        int currentSpeed = new Scanner(System.in).nextInt();
        // if e are using scanner object for one input only, then,
        //we do not need to create a variable for scanner

        int overSpeedLimit= currentSpeed -speedLimit;

        if (overSpeedLimit>0){
            System.out.println("Youre driving "+overSpeedLimit+ " miles over speed limit. slow down!");
        }

    }
}
