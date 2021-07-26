package Day23_Arrays;

public class MinimumNumber {

    public static void main(String[] args) {

        int[]number= {10, 5, 4, 400, 50, 0, -1};

        int minNumber=0;

        for (int i = 0; i <number.length ; i++) {

            if (minNumber>number[i]){
                minNumber=number[i];
            }


        }
        System.out.println(minNumber);
    }
}
/*
Write a program that can find the minimum number from an array of integers

ex:
array =  {10, 5, 4, 400, 50, 0, -1}

output = -1


 */
