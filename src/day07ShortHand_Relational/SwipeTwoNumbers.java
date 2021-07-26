package day07ShortHand_Relational;

public class SwipeTwoNumbers {


    public static void main(String[] args) {

        int a = 200;
        int b= 300 ;
        int c = a;


        a = b;
        b = c;


        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
