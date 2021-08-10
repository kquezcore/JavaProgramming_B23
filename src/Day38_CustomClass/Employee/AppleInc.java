package Day38_CustomClass.Employee;

import java.util.ArrayList;
import java.util.Arrays;

public class AppleInc {
    public static void main(String[] args) {
        Employee employee1= new Employee();
        employee1.setInfo("Karina ", 'F', 11, "SDET",115000);

        System.out.println(employee1);



        Employee employee2= new Employee();
        employee2.setInfo("Abbos",'M',12,"QA", 100000);

        System.out.println(employee2);

        Employee employee3= new Employee();
        employee3.setInfo("Ivana",'F',13,"QA", 115000);

        Employee employee4= new Employee();
        employee4.setInfo("Nadya",'F',14,"QA", 130000);

        Employee employee5= new Employee();
        employee5.setInfo("Nadina",'F',15,"QA", 120000);

        Employee employee6= new Employee();
        employee6.setInfo("Komiljon",'M',16,"QA", 114000);

        Employee employee7= new Employee();
        employee7.setInfo("Andrei",'M',17,"QA", 116000);


        Employee[]arr={employee1,employee2,employee3,employee4,employee5,employee6,employee7};
        ArrayList<Employee>employees= new ArrayList<>();
        employees.addAll(Arrays.asList(arr));

        double budget= 0;

        for (Employee each :employees) {
            System.out.println(each);
           budget += each.salary;
        }
        System.out.println("Budget= "+budget);


        System.out.println("=========================================================");

        ArrayList<Employee>list1= new ArrayList<>(employees);
        list1.removeIf(employee -> employee.salary>=130000);
        for (Employee each: list1){
            System.out.println(each);
        }
        System.out.println("======================================");

    }
}
