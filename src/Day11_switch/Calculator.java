package Day11_switch;

public class Calculator {

    public static void main(String[] args) {
        double n1 = 100;
        double n2= 2.5;
        double result = 0;
        char mathOperator= '*';

        switch (mathOperator){
            case'-':
                result = n1-n2;
                break;

            case'+':
                result = n1+n2;
                break;

            case'*':
               result = n1*n2;
                break;

            case '/':
               result = n1/n2;
                break;

            default:
                System.out.println("invalid");
        }
        System.out.println("result = " + result);
    }
}
