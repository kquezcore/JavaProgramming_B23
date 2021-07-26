package Day28_Methods;

public class Tasks {
    public static void main(String[] args) {

    }

    //6. calculate the garde of the student based on the score
    public static void CalculateGrade(int score) {
        char grade = 'A';
        if (score >= 0 && score >= 100) {
            if (score >= 90) {
                grade = 'A';
            } else if (score >= 80) {
                grade = 'B';
            } else if (score >= 70) {
                grade = 'C';
            } else if (score >= 60) {
                grade = 'D';
            }
            System.out.println(grade);
        }
    }
    //    7. create a method that can reverse any String

}
/*

    8. write a method that can print out the unique elements from an array of string

    9. write a method that can check if a string is plaindrome, print true if it's  otherwise print false

    10. write a method that can remeove the duplicates from the string
            "abababa"
            "ab"

    11. wirte a method that can print out the maximum number from any array of integers

    12. wirte a method that can print out the minimum number from any array of integers

 */