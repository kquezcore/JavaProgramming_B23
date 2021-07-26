package Day10_IfStatements;

public class GradeReport {
    public static void main(String[] args) {
        int score = -85; // 0-100

        String grade= ""; // a,b,c,d,f

        if (score>=0&&score<= 100){

            if (score >= 90){
                grade= "A";
            }else if  (score>= 80){
                grade = "B";
            }else if  (score>= 70){
                grade = "C";
            }else if  (score>= 60){
                grade = "D";
            }else{
                grade = "F";
            }
        }else {//opposite pre-condition; if the score is invalid
            grade = "Invalid";
        }
        System.out.println("grade = " + grade);
    }
}
