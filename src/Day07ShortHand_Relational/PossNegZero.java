package Day07ShortHand_Relational;

public class PossNegZero {

    public static void main(String[] args) {

        int number = -100;
        boolean positiveNumber = number > 0;
        boolean negativeNumber = number < 0;
        boolean isZero = number == 0;

        //boolean isZero = positiveNumber == false && negativeNumber == false ;
        //boolean positiveNumber = negativeNumber== false && isZero -- false;
        System.out.println(number +"positiveNumber = " + positiveNumber);
        System.out.println(number+ "negativeNumber = " + negativeNumber);
        System.out.println(number+ "isZero = " + isZero);



    }
}
