package Variables_1;

public class Flp {
    public static void main(String[] args) {
        // temporary variable

        int J = 7;
        int K = 8;
        int tempVariable;
        //Swapping in steps
        tempVariable = J;// tempVarible= 7
        J = K;//j=8
        K = tempVariable;//K= 7

        //Verify swapped values
        System.out.println("J = " + J + " and K = " + K);
    }
}
