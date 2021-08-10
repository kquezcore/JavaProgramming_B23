package Day38_CustomClass.Employee;

public class Employee {

public String name;
public char gender;
public int ID;
public String jobTittle;
public double salary;

    public void setInfo(String name, char gender, int ID, String jobTittle, double salary) {
        this.name = name;
        this.gender = gender;
        this.ID = ID;
        this.jobTittle = jobTittle;
        this.salary = salary;
    }

    public String toString() {
        return "Day38_CustomClass.Employee.Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", ID=" + ID +
                ", jobTittle='" + jobTittle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
/*
Employees:
    Attributes:
        employeeName, gender, SSN, employeeID, JobTitle, Salary

    Actions:
        attendMeeting, Workoing, getInfo, SetInfo

    ArrayList of employees:
        1. remove all the employtees who are makeing lass than 100K
        2. remove all the QAs

BankAccount
        attributes/data that can have are:
                1. AccountHolder, 2. AccountNumber, 3. Balance

        Actions:
            1. CheckBalance,   2. deposit,  3. withdraw

        requiremnts:
            1. user should be able to deposit money into their account
            2. user should be able to withdraw money from their account
                2.1 if the withdrawing account is greater than available balance, 35$ penalty charge will be added
                2.2 if the balance is less than or equal to 0, user should not be able to withdraw money
            3. user should be able to see their balance
 */