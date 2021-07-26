package day06UnaryOperators;

public class PostPreOperators {

    public static void main(String[] args) {


        int r = 200;
        System.out.println(r++);
        System.out.println("r = " + r);

        int p = 200;
        System.out.println(++p);
        System.out.println("p = " + p);


        System.out.println("-------------");


        int y = 100;
        int result = y++ + 1;

        System.out.println("y = " + y);

        System.out.println("result = " + result);

        System.out.println("----------------------------");

        int z = 100;

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


        int xw = 10; // x= 10 + 1 = 11- 1 = 10 + 1 = 11 - 1 = 10

        xw = ++xw - xw-- + xw++ + --xw;

        // 11 -    10 +  11  + 10
        // 0+ 10 + 10
        //10 + 10
        // 20

        System.out.println("xw = " + xw);


        System.out.println("---------");


        int yr = 50; // y 50 +1 = 51 - 1= 50
        int zr = -yr++ + --yr - ++yr + yr--;
        //  zr= -50 + 50   - 51 + 51
        // 0 - 51 + 51
        // - 51 + 51
        // 0

        System.out.println("zr = " + zr);


    }
}
