package Day23_Arrays;

public class NestedLoop {
    public static void main(String[] args) {

        //************* TO MANUALLY INPUT THE PRINT 5 TIMES*************
        for (int i = 0; i <=5 ; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i = 0; i <=5 ; i++) {
            System.out.print(i+" ");
        }
        System.out.println();

        for (int i = 0; i <=5 ; i++) {
            System.out.print(i+" ");
        }
        System.out.println();

        for (int i = 0; i <=5 ; i++) {
            System.out.print(i+" ");
        }
        System.out.println();

        for (int i = 0; i <=5 ; i++) {
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("---------------------------------------------------");

        //******** TO PRINT STATEMENT 5 TIMES NESTED LOOP************************

        for (int j = 6; j <= 10 ; j++) {
            for (int i = 1; i <5; i++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        }


    }
