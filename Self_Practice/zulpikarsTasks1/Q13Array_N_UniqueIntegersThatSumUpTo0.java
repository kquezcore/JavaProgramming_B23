package zulpikarsTasks1;

import java.util.Arrays;

public class Q13Array_N_UniqueIntegersThatSumUpTo0 {

    public static void main(String[] args) {

        int [] nums= {20,30,1,4};
        System.out.println(Arrays.toString(sumZero(nums.length)));


    }
    public static int[] sumZero(int n) {
        int[] result = new int[n];
        if (n == 1) {
            result[0] = 0;
            return result;
        }
        int x = n / 2;
        if (n % 2 == 0) {
            int i = 0;
            while (i < n) {
                result[i] = x;
                result[i + 1] = -x;
                i += 2;
                x--;
            }
        } else {
            result[0] = 0;
            int i = 1;
            while (i < n) {
                result[i] = x;
                result[i + 1] = -x;
                i += 2;
                x--;
            }
        }
        return result;
    }
}
/*
WRITE A FUNCTION:

- That give and integer N(1<N<100), Returns an array containing N unique integers that sum up to 0.

- the function could return [1,0,-3,2] or [-2,1,-4,5]

-- the answer [1,-1,1,3] should be incorrect (because the value 1 occurs twice)

-- for N = 3. one of the possible answers is [-1,0,1] (but there are many more correct answers)

 */