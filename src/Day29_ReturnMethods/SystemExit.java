package Day29_ReturnMethods;

public class SystemExit {
    public static void main(String[] args) {

        passOrFailed(100);
        System.out.println("Test completed");
    }
    public static void passOrFailed(int score){

        if(score <0 || score > 100){
            System.out.println("Invalid");
            // System.exit(0); // terminates everything
            return;  // exits the current method
            //   System.out.println("Hello"); // unreachable
        }

        if(score>= 60){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }
    }
}
