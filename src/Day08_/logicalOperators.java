package Day08_;

public class logicalOperators {

    public static void main(String[] args) {

        System.out.println( !true );// false
        System.out.println(  !false);// true


        System.out.println(true == !false);


        System.out.println("-------------------");






        int score = 80;
        boolean passed = score>=60;
        boolean failed = !passed;

        System.out.println("--------------------------");

        int age = 21;
        boolean eligible = age >= 21;
        boolean notEligible = !eligible;

    }
}
