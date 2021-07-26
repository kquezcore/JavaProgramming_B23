package day08_;

public class EligibleToVote {

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
