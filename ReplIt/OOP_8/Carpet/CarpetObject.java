package OOP_8.Carpet;
import OOP_8.Carpet.Carpet;

import java.util.Scanner;

public class CarpetObject {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Carpet c = new Carpet();
        System.out.println((int)c.totalPrice);

        Carpet c2 = new Carpet(in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextBoolean());
        System.out.println((int)c2.totalPrice);

    }
}