package day07ShortHand_Relational;

public class ValidTriangle {

    public static void main(String[] args) {


        int angle1 = 60,
                angle2 = 60,
                angle3 = 60;

        boolean isValid = (angle1+angle2+angle3) == 180;
        System.out.println("isValid = " + isValid);

    }
}
