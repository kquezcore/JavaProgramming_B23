package Day23_Arrays;

public class MaximumAmdMinimumNumber2 {

    public static void main(String[] args) {

        int[]numbers= {10, 5, 4, 400, 50, 0, -1};
        int max= numbers[0];
        int min = numbers[0];
        for (int i = 0; i <= numbers.length-1 ; i++) {
            int each = numbers[i];

            if (each> max){//  if any greater numbers is occurred

               max = each;

            }
            if (each< min ){
                min = each;
            }
        }

    }
}
/*
Write a program that can find the maximum number from an array of integers

ex:
array =  {10, 5, 4, 400, 50, 0, -1}

output = 400
 */