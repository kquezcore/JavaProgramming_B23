package Methods_6;

import java.util.Scanner;

public class Methods_ReturnMax {

    public static int max(int x, int max) {
        // Code here

        if (max > x) {
            System.out.println(max);
        } else if (x > max) {
            System.out.println(x);
        } else {
            System.out.println(x);
        }
        return x;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(max(in.nextInt(), in.nextInt()));
    }


}
/*
Finish the method max which has two parameters, x and max.

if x is bigger than max return x
if max is bigger than x return max
all other cases return x
Example:

max(1,10) -> 10
max(1,10) -> 10
max(11,5) -> 11
 */