package Day06UnaryOperators;

public class UnaryOperators {

    public static void main(String[] args) {
        int ae = 100 ;
        ++ ae ;
        System.out.println("ae = "+ ae);
        // ++ increments the value by one

        int b = 100;
        --b;

        System.out.println("b "+ b);


        System.out.println("===---------------");
        int n1 = 50;
        int n2 = n1++;

        System.out.println("n1 ="+ n1);
        System.out.println("n2 = " + n2);

        int a1 = 100;
        int a2 = ++a1;

        System.out.println("a1 = " + a1);
        System.out.println("a2 = " + a2);


        System.out.println(" -------------");

        int r = 200;
        System.out.println( r++);
        System.out.println("r = " + r);

        int p = 200;
        System.out.println(++p );
        System.out.println("p = " + p);


        System.out.println("-------------");


        int y = 100;
        int result = y++ + 1;

        System.out.println("y = " + y);

        System.out.println("result = " + result);

        System.out.println("----------------------------");

        int z= 100;

        int result2 = ++z + 1;

        System.out.println("z = " + z);

        System.out.println("result2 = " + result2);

        int a = 1;
        a = -a-- + a++ / -a-- * --a;
        // -1 + 0/ -1 *-1
        //-1 + 0 * -1
        //-1 + 0
        //-1


        System.out.println("a = " + a);


        int xe = 10; // x= 10 + 1 = 11- 1 = 10 + 1 = 11 - 1 = 10

        xe = ++xe - xe-- + xe++ + --xe;

        // 11 -    10 +  11  + 10
        // 0+ 10 + 10
        //10 + 10
        // 20 

        System.out.println("xe = " + xe);


        System.out.println("---------");


        int ye = 50; // y 50 +1 = 51 - 1= 50
        int ze = -ye++ + --ye - ++ye + ye--;
        //  ze= -50 + 50   - 51 + 51
        // 0 - 51 + 51
        // - 51 + 51
        // 0

        System.out.println("ze = " + ze);
        


    }
}
