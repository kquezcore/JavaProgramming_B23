package Day10_IfStatements;

public class EligibleToVote {

    public static void main(String[] args) {


        int age =15;
        String citizen = "";


       String citizen2 = (age >= 18 )? "Eligible to Vote" : "Not Eligible to Vote";
        System.out.println("citizen2 = " + citizen2);

    }
}

/*
 int n = 100;
        String result = "";

        if (n%2== 0 ){
            result = "even";
        }else {
            result = "Odd";
        }
        System.out.println(result);

        System.out.println("----------------------------");

        String result2 = (n % 2 == 0)? "Even " : "Odd";
        System.out.println(result2);
    }

    public static void main(String[] args) {

        String Name= "James";
        int age =15;
        String citizen = "USA";
        boolean eligibleToVote = age >= 21 && citizen== "USA";

         if (eligibleToVote){
             System.out.println(Name+ "is eligible to vote");

         }

         if (!eligibleToVote){
             System.out.println(Name + " is not eligible to vote");
         }
    }
}
 */