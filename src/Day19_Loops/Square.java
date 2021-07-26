package Day19_Loops;

public class Square {
 public static void main(String[] args) {

  for (int i = 1; i <= 8; i++) {
   System.out.println("* * * * * *");
  }
  System.out.println();
/*


    2.  print the following shape:
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *

 */

  System.out.println("---------------------------------------------------------------------------");

  for (int i = 1; i <=10 ; i++) {


      if (i==1 ||i ==10){
       System.out.println("* * * * * *");
      }else{
       System.out.println("*         *");
      }

  }
  /*
   3. print the following shape:
                        * * * * * *
                        *         *
                        *         *
                        *         *
                        *         *
                        *         *
                        *         *
                        *         *
                        *         *
                        * * * * * *
 */

 }
}
