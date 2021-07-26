package Day11_switch;

public class terniaryPractice {
    public static void main(String[] args) {


        double salary = 50000;
        int creditScore = 550;


        String result = salary >= 60000 && creditScore >= 650 ? "Approved " : "Denied";
        System.out.println("result = " + result);

        System.out.println("--------------------------");


        String sport = "golf";

        int price = (sport== "soccer"|| sport == "Tennis")?100 : 50 ;
        System.out.println("price = " + price);

        System.out.println("----------------------");



        int n1= 100,
                n2=200,
                n3 = 300;

        String result2 = (n1>n2 && n1>n3)? "n1 is bigger"  :(n2 > n1 && n2 >n3)? "n2 is bigger" : "n3 is bigger";
        System.out.println("result2 = " + result2);


        System.out.println(" -----------------");

        int number = 12;
        String name = "";

        if (number>=1 &&number <= 12){

            name = (number ==1)? "Jan" : (number ==2)? "feb" : (number == 3)? "March": (number == 4)? "April"
                    :(number ==5)? "May" : (number ==6)? "June" : (number == 7)? "July": (number == 8)? "August"
                    :(number ==9)? "Sept" : (number ==10)? "Oct" : (number == 11)? "Nov": "dec";

        }else{

            name = "Invalid";
        }
        System.out.println("name = " + name);


        /*
        4. In Cybertek we have three batch types: US morning, US evening, EU.
        Depending on a batch type (String) print information about the batch.

        First figure out is is a US batch or EU batch

            - for US batches:

                > Figure out is it a morning batch or evening batch
                    > morning - print: Class times are 10-5 EST. M, T, Th, F.
                    > evening - print: Class times are 7-10 EST. M, T, W, Th, S, S

            - for EU batches:

                > print: Class times are  10-5 EST. M, T, W, Th, F.

              If Batch type is not EU or US, print Invalid Batch
                NOTE: MUST APPLY NESTED IF

         */


        /* 3. write a program that checks for the bigger of 3 numbers.
                you get 3 int variables with different values: n1 , n2 and n3
        if n1 is biggest output: "n1 is bigger"
        if n2 is biggest output: "n2 is bigger"
        if n3 is biggest output: "n3 is bigger"
        NOTE: MUST APPLY TERNARY

         */

        /*
        2. Given a sport you play at the community center you will have to pay some entrance fee.

                    Soccer or Tennis fee is: 100
                    Otherwise fee is: 50
               NOTE: MUST APPLY TERNARY
         */

       /* if (salary >= 60000 && creditScore >= 650){
            result = "Loan Approved";
        }else {
            result = "Loan Denied";
        }
        System.out.println("result = " + result);

        */
    }
}
/*


        double salary = 50000;
        int creditScore = 550;
        String loan = "";

        if (salary >= 60000) {
            loan = "Approved";
        } else if (creditScore >= 650) {
            loan = "Approved";
        } else {
            loan = "Denied";
        }
        System.out.println("loan = " + loan);
        System.out.println("----------------------------------------------------------");

        String Loan2 = (salary >= 60000 && creditScore >= 650) ? "Approved " : "Denied";

        System.out.println("Loan2 = " + Loan2);
    }
 */

