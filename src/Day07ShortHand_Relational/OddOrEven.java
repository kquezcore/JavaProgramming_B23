package Day07ShortHand_Relational;

public class OddOrEven {

    public static void main(String[] args) {
        int number = 101;
        boolean even = number%2 == 0;// if the number can be divided by two with zero remainder
        boolean odd = number%2 != 0;// if there's a remainder
        // number%2 >0
        // even == false ; if the numbwe is not even number, then its odd number

        System.out.println(number + " is even = " + even);
        System.out.println(number + " is odd = " + odd);

    }
}
