package Day10_IfStatements;

public class NameOfMonths {

    public static void main(String[] args) {
        int number = 10;// 1-12

        String name = "";

        if (number == 1){
            //System.out.println("Jan");
            name = "Jan";
        }else if (number ==2){
            //System.out.println("feb");
            name = "Feb";
        }else if (number == 3){
           // System.out.println("March");
            name = "March";
        }else if (number ==4){
            //System.out.println("April");
            name = "April";
        }else if (number == 5){
            //System.out.println("May");
            name = "May";
        }else if (number ==6){
           // System.out.println("June");
            name = "June";
        }else if (number == 7){
            //System.out.println("July");
            name = "July";
        }else if (number ==8){
           // System.out.println("Aug");
            name = "August";
        }else if (number == 9){
            //System.out.println("sept");
            name = "Sept";
        }else if (number ==10){
          //  System.out.println("Oct");
            name = "Oct";
        }else if (number == 11){
           // System.out.println("Nov");
            name = "Nov";
        }else {
           // System.out.println("Dec");
            name = "Dec";

        }
        System.out.println("name = " + name);

    }
}
