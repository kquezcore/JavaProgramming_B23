package Day41_CustomClass_Constructor;

public class Employee {
    public String name, jobTittle;
    public double salary;

    public Employee(String name, String jobTittle, double salary) {
        // constructor has to be the class name!
        this.name= name;
        this.jobTittle = jobTittle;
        this.salary= salary;


    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTittle='" + jobTittle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
