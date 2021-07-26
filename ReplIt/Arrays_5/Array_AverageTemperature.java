package Arrays_5;

import java.util.Scanner;

public class Array_AverageTemperature {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };

        // Do not touch above. Use array temps

        double sum =0, average;

        for (int i = 0; i < temps.length; i++) {
                sum+=temps[i];
        }
        double avg=sum/temps.length;
        System.out.println(avg);



    }
}

/*
Given an array temps with temperature values find and print the average value

Example:

input: 80 88 88 84 82 78 60 68

output: 78.5
 */