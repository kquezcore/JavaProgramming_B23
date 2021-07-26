package Day12_Scanner;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        Scanner  input = new Scanner(System.in);
        System.out.println("Enter radius of the Circle");
        double radius = input.nextDouble();

        double area = (radius*radius)*3.14;
        double perimeter = 2 * 3.14 * radius;

        System.out.println("The area of the circle is:   " + area);
        System.out.println("The perimeter of the circle is:   " + perimeter);
    }


}
/*
find the are and perimeter of circle
radius decimal
area and perimeter
 */