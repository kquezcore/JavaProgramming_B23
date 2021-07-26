package Day04_Variables;

public class TaxCalculations {

    public static void main(String[] args) {

        int salary = 120000;
        double stateTax = 0;
        double federalTax = 0.21;


        double totalStateTax = salary * stateTax;
        double totalFederalTax = salary * federalTax;
        double salaryAfterTax = salary - totalStateTax - totalFederalTax;


        System.out.println(" your salary is $"+ salary);
        System.out.println(" you need to pay $" +totalStateTax + " of state tax");
        System.out.println(" you need to pay $" +totalFederalTax + "of federal tax");
        System.out.println(" you take home salary is $" +salaryAfterTax);



    }

}
