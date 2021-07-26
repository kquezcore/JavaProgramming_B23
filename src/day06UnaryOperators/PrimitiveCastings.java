package day06UnaryOperators;

public class PrimitiveCastings {

    public static void main(String[] args) {
        byte a = 10;
        long b = a; // implicit casting

        double d = 10.0;
        int f = (int)(long )d ;// explicit casting

        System.out.println("--------------------");

        double num1 = 1000.0;
        int num2 = (int) num1;// explicit casting

        System.out.println("num2 = " + num2);
        System.out.println(" num1 = "+ num1);

        System.out.println(( int )100.23456);







    }


}

    // converting one primitive type to another

    // double> float>long>int>short>byte

    //larger primitive tyoe cannot be assigned to smaller type

    // 2 tyes

    //implicit casting: casting smaller type to larger
    //ex: double a + 3
    // a== > 3.0
    // long l = 10;
    // l ==> 10l

    //explicit casting: casting the larges type to smaller. Manually done
    // oduble a = 3


