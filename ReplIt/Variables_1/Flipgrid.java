package Variables_1;

public class Flipgrid {
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
        System.out.println("=============================================");
            int j = 1;
            int k = 2;
            //Swapping in steps
            j = j + k;    //x = 1 + 2 = 3
            k = j - k;   //y = 3 - 2 = 1
            j = j - k;   //x = 3 - 1 = 2
            //Verify swapped values
            System.out.println("j= " + j + " and k = " + k);
        }
    }

