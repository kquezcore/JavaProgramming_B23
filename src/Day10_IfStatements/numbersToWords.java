package Day10_IfStatements;

public class numbersToWords {

    public static void main(String[] args) {

        int number = 7;
        String name ="";


        if (number >= 0&& number <= 9 ){

            if (number == 0) {
                name = "Zero";
            }else if (number == 1){
                name = "One";
            } else if (number == 2) {
                name ="Two";
            }else if (number == 3){
                name ="Three";
            }else if (number == 4){
                name ="Four";
            }else if (number == 5){
                name ="Five";
            }else if (number == 6){
                name ="Six";
            }else if (number == 7){
                name ="seven";
            }else if (number == 8){
                name="Eight";
            }else {
                System.out.println("nine ");
            }

            System.out.println("name = " + name);
        }

    }


}

