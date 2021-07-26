package Day10_IfStatements;

public class PassOrFail {
    public static void main(String[] args) {
        int score = 50;
        String PassOrFail = (score >= 60) ? "passed" : "Failed";
        System.out.println("PassOrFail = " + PassOrFail);
    }


        }

/*


    public static void main(String[] args) {
        int score = 50;


        if (score >= 60 ){
            System.out.println("passed");
        }
        if (score <60){
            System.out.println("Failed");

        }

        System.out.println("-------------------");

        if (score >=60){
            System.out.println("Passed");

        }else{// otherwise
            System.out.println("Failed");

        }


    }
}
 */