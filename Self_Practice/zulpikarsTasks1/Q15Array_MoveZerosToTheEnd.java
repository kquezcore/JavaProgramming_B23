package zulpikarsTasks1;

import java.util.Arrays;

public class Q15Array_MoveZerosToTheEnd {
    public static void main(String[] args) {

        int [] array= {2,0,0,4,0,9};

    Q15Array_MoveZerosToTheEnd moveZerosToTheEnd= new Q15Array_MoveZerosToTheEnd();

        System.out.println(Arrays.toString(moveZerosToTheEnd.moveZs(array)));
        }
    public int[] moveZs(int[] array) {

        int[] result = new int[array.length];
        int count = 0;

        for (int each : array) {
            if (each != 0)
                result[count++] = each;
        }

        return result;

    }


}
// Write a method that can move all the zeros to the last indexes of the array(do not use sort method)