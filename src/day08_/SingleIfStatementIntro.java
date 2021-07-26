package day08_;

public class SingleIfStatementIntro {

    public static void main(String[] args) {
        String name = "Muhtar";

        int score = 90;
        boolean passed = score >= 60;

        if (score>= 60 ){
            System.out.println(" congrats" +name+ " you passed the exam");
        }

         if (!passed ){
            System.out.println(name + "you failed the exam");
        }
    }
}
