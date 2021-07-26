package Day11_switch;

public class PassOrFail {

    public static void main(String[] args) {

        char grade = 'A';

        /*
         Pass:
         a, b,c,d
         failed: F
         */
        switch (grade) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
                System.out.println(" Passed");
                break;
            case 'F':
                System.out.println("Failed");
                break;

            default:
                System.out.println("Invalid Grade");
        }

    }
}