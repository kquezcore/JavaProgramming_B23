package Day45_Inheritance;

public class SquareObjects {

    public static void main(String[] args) {
        Square sqar1 = new Square(10);

        System.out.println(sqar1.getSide());

        sqar1.setSide(20);

        System.out.println(sqar1.getSide());

        Square squar2= new Square(sqar1.getSide());

        System.out.println(sqar1.equals(squar2));

        System.out.println("------------------------------------");

        Square s1 = new Square(5);
        Square s2 = s1;

        s2.setSide(10);
        System.out.println( s1.getSide() +" : "+s2.getSide());

        System.out.println("----------------------------------");

        Square l1 = new Square(3);
        l1 = new Square(4);

        System.out.println(l1.getSide());

    }
}
