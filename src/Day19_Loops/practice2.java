package Day19_Loops;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class practice2 {
    public static void main(String[] args) {

        //a-z
        for (int i = 65; i <= 90; i++) {
            System.out.print((char) i+" ");
        }

        System.out.println();
        System.out.println("--------------------------------------------------------------------");

        //a-z---forwards

        for (char i = 'A'; i >='Z'; i++) {
            System.out.print(i+" ");
        }

        System.out.println();
        System.out.println("---------------------------------------------------------");

        //z-a---backwards

        for (char i = 'Z'; i >='A'; i--) {
            System.out.print(i+" ");
        }

        System.out.println();
        System.out.println("-----------------------------------------------------");

        //z-a---NON-CAPITAL LETTER*************

        for (char i = 'a'; i >='z'; i++) {
            System.out.print(i+" ");
        }

        System.out.println();
        System.out.println("------------------------------------------------------------------");

        // PRINT CHARACTERS FROM 1000 TO 30000IN SAME LINE SEPARATED BY A SPACE


        for (int i = 1000; i <+30000 ; i++) {
            System.out.print(i+" ");

        }
    }


}
