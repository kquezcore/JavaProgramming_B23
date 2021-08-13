package Day43_OOP_Encapsulation;

import java.util.ArrayList;
import java.util.Arrays;

import static Day43_OOP_Encapsulation.Candy.*;
public class CandyFactory {

    // Create a class named CandyFactory
    //            Create an ArrayList of candies
    //            Add five objects of candies


    public static void main(String[] args) {
        ArrayList <Candy> candy= new ArrayList<>();
        candy.addAll(Arrays.asList(new Candy("Snickers",2,5,true),
                new Candy("Twix",1,2,false),
                new Candy("M&M",5,3,true),
                new Candy("Hersheys",3,5,false),
                new Candy("Heath",1,2,false)
        ));

        //   use for each loop to print the brand and price of each candy

        for (Candy eachCandy:candy) {
            System.out.println(eachCandy.getBrand()+" $"+eachCandy.getPrice());
        }

    }
}