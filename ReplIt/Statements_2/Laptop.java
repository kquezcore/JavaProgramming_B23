package Statements_2;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Laptop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double screenSize=0.0,  price= 0;
        int RAM, memorySize;
        String CPU= "";
        String storageType;
        String screenResolution;

        System.out.println("Select screen size:");
        screenSize=scan.nextDouble();
        if (screenSize==13.3){
            price +=200;
        }else if (screenSize==15.0){
            price+=300;
        }else if (screenSize==17.3){
            price+=400;
        }else{
            System.out.println("Screen size invalid!");
        }

        System.out.println("Select CPU type:");
        CPU = scan.next();
        if (CPU.equalsIgnoreCase("i3") ){
            price += 150;
        }else if (CPU.equalsIgnoreCase("i5")){
            price+=250;
        }else if (CPU.equalsIgnoreCase("i7")){
            price+= 350;
        }else{
            System.out.println("Invalid CPU type!");
        }

        System.out.println("Select RAM size:");
        RAM= scan.nextInt();
        if (RAM > 0) {
            price += (RAM / 4) * 50;
        } else {
            System.out.println("Invalid ram size!");
        }

        System.out.println("Select storage type:");
        storageType= scan.next();
        System.out.println("Enter memory size:");
        memorySize = scan.nextInt();
        if (storageType.equalsIgnoreCase("HDD")&&memorySize>0){
            price+=(memorySize)/500*50;
        }else if (storageType.equalsIgnoreCase("SSD")&&memorySize>0){
            price+=(memorySize)/500*100;
        }else {
            System.out.println("Invalid memory type or size!");
        }

        System.out.println("Enter screen resolution:");
        screenResolution= scan.next();

        if (screenResolution.equalsIgnoreCase("FULLHD")){
            price+= 100;
        }else if (screenResolution.equalsIgnoreCase("4K")){
            price+=200;
        }else{
            System.out.println("Invalid screen resolution!");
        }
        System.out.println("Statements_2.Laptop price is: "+ price);

    }
}
   /* Write a program that will calculate laptop price based on the components.

        First ask user for a screen size.
        - If screen size is equals to 13.3, add  $200 to the laptop price.
        - If screen size is equals to  15.0 - add  $300 to the laptop price.
        - If screen size is equals to  17.3 - add  $400 to the laptop price.

        Then ask user for CPU type.
        - If CPU type equals to i3, add  $150 to the laptop price.
        - If CPU type equals to i5, add  $250 to the laptop price.
        - If CPU type equals to i7, add  $350 to the laptop price.

        Then ask user for RAM size.
        - Add  $50 for every 4GB of ram to the laptop price.

        Then, ask user for storage type. There are 2 options: SSD and HDD.
        - If it's HDD - add $50 to the laptop price for every 500gb.
        - If it's SSD - add $100 to the laptop price for every 500GB.

        Then ask user for for screen resolution. There are 2 options: FULLHD and 4K.
        - Add $100 if it's FULLHD screen
        - Add $200 if it's 4K screen.

        Example:

        ```
        Display message: Select screen size:
        input: 13.3
        Display message: Select CPU type:
        input: i7
        Display message: Select RAM size:
        input: 8
        Display message: Select storage type:
        input: SSD
        Display message: Enter memory size:
        input: 1000
        Display message: Enter screen resolution:
        input: 4K
        Display message: Statements_2.Laptop price is: $1050.0
        ```

        Example #2


        ```
        Display message: Select screen size:
        input: 13.3
        Display message: Select CPU type:
        input: i3
        Display message: Select RAM size:
        input: 4
        Display message: Select storage type:
        input: HDD
        Display message: Enter memory size:
        input: 500
        Display message: Enter screen resolution:
        input: FULLHD
        Display message: Statements_2.Laptop price is: $550.0
        ```

    */