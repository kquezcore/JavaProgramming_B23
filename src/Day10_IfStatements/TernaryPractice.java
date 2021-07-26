package Day10_IfStatements;

public class TernaryPractice {

    public static void main(String[] args) {

        int number = 100;
        
        //if         this condition is true then is positive else if is negative else zero
        String result = (number>0)? "positive":(number<0)? "negative":"zero";

        System.out.println("result = " + result);


        System.out.println("--------------");

        int score = 100;

        char grade = (score>= 90)? 'A':(score>=80)? 'B':(score>=70)?'C':(score>=60)?'D': 'F';

        }






    }

