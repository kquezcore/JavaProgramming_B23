package day03_Variables;

public class SalaryCalculator {

    public static void main(String[] args) {
        int hourlyRate = 60;
        int weeklyHour = 50;

        int salary = hourlyRate * weeklyHour * 48;

        System.out.println(salary);


        double taxRate = 0.32;
        double totalTax = salary * taxRate;
        double salaryAfterTax = salary - totalTax;

        System.out.println(salaryAfterTax);


    }
}
/*
hourly rte
weekly hurs
number of weeks: 53


 */