package Day05_ArithmeticOperators;

public class ArithmeticOperators {

    public static void main(String[] args) {

        System.out.println(25 / 2);
        System.out.println(25.0 /2);
        System.out.println(25/2.0);
        System.out.println(25d / 2);

        int a =100/3 ; // 33.33333.....

        System.out.println("a ="+ a );

        double b =100/3;

        System.out.println("b= "+ b);

        double c = 100.0/3;

        System.out.println("c = " + c);

        System.out.println("=---------------------");

        int n1 =100;
        int n2 = 40;

        System.out.println(n1%n2);// 20 is the remainder of 100divided by 40
        // 30/7 = 4 why?  7*4 35
        //30- (7*4)= 2

        int num3 = 10;
        int num4 = 3;

        System.out.println(num3 % num4);




    }
}
