package Day10_IfStatements;

public class months2 {
    public static void main(String[] args) {

        int numberOfMonth = 5;
        String month = "";


        if (numberOfMonth >=1 && numberOfMonth <=12){
            if (numberOfMonth== 1){
            month = "January";
        } else if (numberOfMonth == 2) {
                month ="February";
        } else if (numberOfMonth == 3) {
                month ="March";
        } else if (numberOfMonth == 4) {
                month ="April";
        } else if (numberOfMonth == 5) {
                month ="May";
        } else if (numberOfMonth == 6) {
                month ="June";
        } else if (numberOfMonth == 7) {
                month ="July";
        } else if (numberOfMonth == 8) {
                month ="August";
        } else if (numberOfMonth == 9) {
                month ="September";
        }  else if (numberOfMonth == 10) {
                month ="October";
        } else if (numberOfMonth == 11) {
                month ="November";
        } else if (numberOfMonth == 12) {
                month ="December";
        }
            System.out.println("month = " + month);
        }

    }
}