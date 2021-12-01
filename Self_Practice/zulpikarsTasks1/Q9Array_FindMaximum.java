package zulpikarsTasks1;

import java.util.Arrays;

public class Q9Array_FindMaximum {
    public static void main(String[] args) {
      int [] n = {1,2,3,4,5};

      Q9Array_FindMaximum findMaximum= new Q9Array_FindMaximum();

        System.out.println(findMaximum.max(n));


    }

    public static int max(int[] array){
        int max= array[0] ;

        for (int each : array) {
            max =  Math.max( each, max  );
        }

        return max;
    }
}
// write a method that can find the max number form an int Array