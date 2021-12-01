package zulpikarsTasks1;

public class Q10Array_FindMinimum {
    public static void main(String[] args) {
        int [] n = {1,2,3,4,5};

        Q10Array_FindMinimum findMin= new Q10Array_FindMinimum();

        System.out.println(findMin.min(n));
    }
    public static int min(int[] array){
        int min= array[0] ;

        for (int each : array) {
            min =  Math.min( each, min  );
        }

        return min;
    }
}

// write a method that can find the min number form an int Array