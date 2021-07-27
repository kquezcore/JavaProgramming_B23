package Day05_ArithmeticOperators;

public class OddOrEven {

    // if the remainder of number divided by 2 is equal to 0, then it is Even number.

    // IF IT IS GREATER THAN ZERO, THAN IS AN oDD NUMBER

    public static void main(String[] args) {
        int number = 100;
        boolean isEven = number%2 == 0;
        boolean isOdd = number%2>0 ;

        System.out.println(number + " is and even number:"+ isEven);
        System.out.println(number  + " is and odd number : "+ isOdd);
    }
}
