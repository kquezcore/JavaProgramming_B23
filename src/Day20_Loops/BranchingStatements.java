package Day20_Loops;

public class BranchingStatements {
    public static void main(String[] args) {

        //*********** TO BREAK IN BETWEEN**********

        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                break;// EXIT THE LOOP
            }
            System.out.println(i);

        }

        System.out.println("-----------------------------------------------------");

        //********** TO BREAK AT A NUMBER AND CONTINUE AFTER THAT EXAMPLE: 0 1 2 CONTINUE 4 5 6

        for (int i = 0; i <= 5; i++) {

            if (i == 3) {
                continue;// TO CONTINUE THE LOOP, TO SKIP CERTAIN ALTERATION
            }

            System.out.println(i);
        }

        System.out.println("-----------------------------------------------------");

// ***********TO PRINT ODD NUMBERS FROM 1-- 10 (USING CONTINUE STATEMENT)*************

        for (int i = 1; i < 11; i++) {
            if (i % 2 == 0) {//if i is even number,
                // the continue statement will skip the alteration
                continue;

            }
            System.out.println(i);
        }

        System.out.println("-----------------------------------------------------");

        //*********PRINT ALL THE NUMBERS THAT ARE EVENLY DIVISIBLE BY 3 AND 5 (1-100)*******

        for (int i = 1; i < 101; i++) {
            if (i % 5 != 0 && i % 3 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("-----------------------------------------------------");
//**********TO PRINT ALPHABET BETWEEN A-Z EXCEPT FOR D, T, X ***********

        for (char i = 'A'; i <= 'Z'; i++) {

            if (i == 'D' || i == 'T' || i == 'X') {
                ;

                continue;
            }

            System.out.print(i+ " ");
        }
    }
}