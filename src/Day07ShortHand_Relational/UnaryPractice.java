package Day07ShortHand_Relational;

public class UnaryPractice {

    public static void main(String[] args) {

        int a = 100;// a= 100 + 1= 101= 102-1= 101-1= 100

        int b = -a++ + ++a - a-- * a-- % 2;
        // b = -100  + 102 - 102 * 101 % 2
        // b = -100   + 102- 10302 % 2
        // b = -100 + 102- 0
        // b = 2;

        System.out.println("a = " + a);
        System.out.println("b = " + b);



    }
}


//2. manually calculate the following code fragments:
//
//          1. int a = 100;
//             int b = -a++ + ++a - a-- * a-- % 2