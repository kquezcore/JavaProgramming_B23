package Day45_Inheritance.EmployeeTask;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Tester extends Employee {


    public Tester(String name, char gender, int age, long id, String jobTitle, double salary) {
        super(name, gender, age, id, jobTitle, salary);
    }

    public void testing(){
        System.out.println(jobTitle+" is testing");
    }
}
