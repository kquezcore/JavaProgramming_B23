package day07ShortHand_Relational;

public class EligibleForLoan {
    public static void main(String[] args) {


        System.out.println("---------------");

        String name1 = " Martin guczak";

        int income = 65000;
        int employedFor = 3;
        int credit = 820;
        int age2 = 35;

        boolean eligibleForLoan = income >= 60000 && employedFor >= 2 && age2 >= 18 && credit >= 700;

        System.out.println(name1 + " is eligible for loan: " + eligibleForLoan);


        //  EligileForLoan
        //            income has to be at least 60k
        //            at least have 2 years of work history
        //            at least have 700 of credit score
        //            at least 18 years old
        //
        //        variables:    name, age, workHistory, creditScore, income

        System.out.println("----------------------------"   );

    }
}