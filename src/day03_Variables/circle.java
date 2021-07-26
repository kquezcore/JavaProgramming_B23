package day03_Variables;

public class circle {

    public static void main(String[] args) {

        int r = 5;
        double pi = 3.14;

        double area= r * r * pi;
        double perimeter = 2 * r * pi;

        System.out.print("area"); // does not append new line after printing
        System.out.println(area); //appends new line after printing

        System.out.print(" perimeter: ");
        System.out.println(perimeter );




    }
}


/*
area of circle : r * r * 3.14

perimeter 2 * r 3.14
 */