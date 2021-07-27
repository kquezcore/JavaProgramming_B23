package Day06UnaryOperators;

public class OperatorPrecedence {

    public static void main(String[] args) {
        System.out.println("Adition" +2 + 3);

        //                 "Addition 2" + 3
        //                 "aDDITION 2" +3

        System.out.println("Addition: " + (2+3));

        System.out.println("-------------------");


        int a = 10;
        int b = 3;

        System.out.println("Addition: "+ (a+b));
        System.out.println("Substraction: " + (a-b));
        System.out.println("Multiplication: "+ a * 10);
        System.out.println(" Division: "+ a/b);
        System.out.println("Remainder: "+ a % b);

    }
}
