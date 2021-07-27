package Day07ShortHand_Relational;

public class ShortHandOperators {

    public static void main(String[] args) {


        String name1 = "Muhtar";
        String name2 = "Mehmet" ;
        String name3 = name2; // name 2 = mehmet

        name2 = name1;// name 2 muhtar
        name1 = name2;   // name 1 = muhtar

        name1 = name3;

        System.out.println("name1 = " + name1);
        System.out.println("name2 = " + name2);

        System.out.println("---------------------------");
        int a = 200;
        System.out.println("a = " + a);// 200
        int b = a;
        a = 100 + 300;
        System.out.println("a = " + a);// 400

        System.out.println("--------------");

        int balance = 300;
        balance = balance +200;
        System.out.println("balance = " + balance);

        balance += 1000;
        System.out.println("balance = " + balance);
        
        String school = "Cybertek";
        school += "school";

        System.out.println(" school = " + school);
        
        String name = "John";
        String LastName = "Daniel";

        name+= "";
        name += LastName;

        System.out.println("name = " + name);

        System.out.println(" --------------");

        //withdraw

        balance -= 300;

        System.out.println("balance = " + balance);


        System.out.println("-----------------");
// multiplpication









        System.out.println("--------------");

        //division

        int slices = 10;
        slices /= 5 ;

        System.out.println("slices = " + slices);


        System.out.println("---------------------");

        //% remainder

        int cents = 105;
        int quarters = cents / 25;

         cents %= 25;


        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);

        /*
        remainder = numerator - (denominator * while number of division result)
         10 / 3 ===> 3.3333....
         remainder 10 - (3*3 )= 1

         */















    }
}
