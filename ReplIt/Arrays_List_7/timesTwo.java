package Arrays_List_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class timesTwo {
    public static ArrayList<Integer>timesTwo(ArrayList <Integer> nums) {
        ArrayList<Integer> nums2 = new ArrayList<>();

        for (int each: nums) {
            each = each*2;
            nums2.addAll(Arrays.asList(each));

        }

        return nums2;
    }



    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(timesTwo(list));

    }

}

/*
Create a method that:

is called timesTwo
returns an ArrayList of Integers

takes in a single parameter - an ArrayList of Integers called nums
This method should take the ArrayList parameter and multiply every value by two.
 */