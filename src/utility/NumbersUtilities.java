package utility;

public class NumbersUtilities {

    //isOdd
    public static int OddNum(int num){

    boolean isOdd;

    if (num%2 !=0){
        isOdd= true;
    }else{
        System.out.println("Invalid");
    }
    return num;




    }

    //isEven

    //addition

    //subtraction

    //max
    public static int maxNumber(int[] numbers) {
        //int[] numbers = {10,5,4,400,5,0,-1};

        int max = numbers[0];

        for (int i = 0; i <= numbers.length - 1; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;

    }


    // min
    public static int minNumber(int [] number) {
        int min = number[0];

        for (int i = 0; i <= number.length - 1; i++) {
            if (number[i] < min) {
                min = number[i];
            }
        }
        return min;
    }

    //cube...
}
