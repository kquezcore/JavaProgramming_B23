package Day08_;

public class GradeReport {
    public static void main(String[] args) {
        int score = 75;


        if (score >= 90 && score <= 100){// 90, 91, 92, 93, 94...100
            System.out.println("Excellent, you made an A");
        }

        if (score >= 80 && score <= 89 ){// 81, 82, 83, 84...89
            System.out.println("Good Job, You made a B");
        }

        if (score >= 70 && score <= 79 ) { // 71,72, 73, 74... 79
            System.out.println("Good, you made a C");
        }

        if (score >= 60 && score <= 69 ){
            System.out.println(" You made a D");

        }

        if (score < 60 ){
            System.out.println("Failed");
        }
    }

}


/* score
grade: a: 90 <= score <= 100
       b : 80 <= score <= 89
       c: 70 <= score <= 79
       d : 60<= score <=69
       f : score < 60
 */