package Day23_Arrays;

public class MaximunNumber {

    public static void main(String[] args) {

        int[]number= {10, 5, 4, 400, 50, 0, -1};

        int maxNumber=0;

        for (int i = 0; i <number.length ; i++) {

            if (maxNumber<number[i]){
                maxNumber=number[i];
            }


        }
        System.out.println(maxNumber);
    }
}
/*
Write a program that can find the maximum number from an array of integers

ex:
array =  {10, 5, 4, 400, 50, 0, -1}

output = 400


Write a program that can find the minimum number from an array of integers

ex:
array =  {10, 5, 4, 400, 50, 0, -1}

output = -1


 */