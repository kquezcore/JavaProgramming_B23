package Day12_Scanner;

import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println(" Enter the width of Rectangle: ");
        int width = scan.nextInt();
        System.out.println("Enter the length of Rectangle: ");
        int length = scan.nextInt();

        int area= width * length;
        int perimeter = (width +length) * 2;

        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);

    }

}
