package practice;

import java.util.Scanner;

public class Task3 {



        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                    scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };

            // Do not touch above. Use array temps


            double result=0;
            for(int i=0;i<temps.length;i++){
                result += temps[i];
            }
            result = (result/temps.length);
            System.out.println(result);

        }
    }
/*
Task3:

Given an array temps with temperature values find and print the average value

Example:

input: 80 88 88 84 82 78 60 68

output: 78.5
 */
