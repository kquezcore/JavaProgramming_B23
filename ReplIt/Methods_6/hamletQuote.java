package Methods_6;
import java.util.Scanner;

public class hamletQuote {
    public static boolean hamletQuote(boolean toBe,boolean notToBe){

        boolean isTrue = false;
        if (toBe == true) {
            isTrue = true;


        } else if (notToBe == true) {
            isTrue = true;
        } else if (toBe && notToBe == true) {
            isTrue = true;
        }

        return  isTrue;



    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(hamletQuote(in.nextBoolean(), in.nextBoolean()));
    }
}

