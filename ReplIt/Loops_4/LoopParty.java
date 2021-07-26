package Loops_4;

import java.util.Scanner;

public class LoopParty {
    public static void main(String[] args) {

        String rsvp = "";
        String guestList = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first guest's name:");
        String guestName = scan.nextLine();


        for (int i = 0; i >= 0; i++) {
            System.out.println("Do you want to enter new guest name:");
            rsvp = scan.nextLine();

            if (rsvp.contains("yes")) {
                System.out.println("Please enter guest name:");
                String guest2 = scan.nextLine();
                guestList = guestList + guest2 + ", ";
            } else if (rsvp.contains("no")) {
                break;
            }
        }
        System.out.println("Guest's list: "+guestName+", "+guestList);
    }

// your code
        // ------------------------------------------


    }

/*
Imagine you have a party and need to form the list of the guests. (Assume you have at least one guest)
Ask for the first guest name.
Then ask does user want to enter one more guests.
 If yes - take the next guest input
If not - finish the program and print list of the guests.
Example:

```
Please enter guest name:
Nick
Do you want to enter new guest name:
yes
Please enter guest name:
Linda
Do you want to enter new guest name:
no
Guest's list: Nick, Linda
 */