package day09_ifStatements;

public class GradeReport {
    public static void main(String[] args) {
        int score = 79;

        if (score >= 90 && score <= 100) {// fALSE : SCORE <90
            System.out.println("Your grade is : A");
        } else if (score >= 80) {// FALSE : SCORE <80
            System.out.println("Your grade is : B");
        } else if (score >= 70) {// FALSE: SCORE <70
            System.out.println("Your grade is : C");
        } else if (score >= 60) {// FALSE : SCORE <60
            System.out.println("Your grade is : D");
        }else{
            System.out.println("Your grade is : F");
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
