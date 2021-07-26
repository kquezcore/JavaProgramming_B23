package Day19_Loops;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class forLoopPractice {

    public static void main(String[] args) {
        for (int i = 0; i <= 1000; i++) {// 0,1,2,3,4,5,6,7,8,9....
            System.out.print(i + " ");
        }
        System.out.println();// to make sure next print statement starts from new line
        System.out.println("Hello");

        System.out.println("-----------------------------------------");

        //***********PRINT ODD NUMBERS ONLY************

        for (int i = 1; i <= 100; i++) {//1,2,3,4,5,6.....100
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();//to make sure it prints in a new line

        System.out.println("--------------------------------------------------------------------");

        //***********PRINT ODD NUMBERS ONLY************ other way


        for (int i = 1; i <= 100; i += 2) {// i : 1,3,5,7,9,.....99
            System.out.print(i + " ");
        }


        System.out.println();
        System.out.println("------------------------------------------------------");

        // ************* TO PRINT EVEN NUMBERS 1-100 *****************

        for (int i = 1; i < 100; i++) {//1,2,3,4,5,6.....100
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }}


            System.out.println();//to make sure it prints in a new line

            System.out.println("--------------------------------------------------------------------");

            //******************** WITH VARIABLE DECLARED******************

            String odds = "";
            String evens = "";

            for (int i = 1; i < 101 ; i++) {
                if(i %2 != 0){
                    odds += i+" ";
                }else{
                    evens +=  i+" ";
                }
            }


            System.out.println("odds = " + odds);
            System.out.println("evens = " + evens);
        }
    }

