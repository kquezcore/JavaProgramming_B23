package Day48_JavaRecap.CybertekTask;

import java.time.LocalDate;

public class Employee extends Person{


    /*
    create the following sub classes:
            ScrumMaster
            ProductOwner
            ProjectManager
            BusinessAnalyst
            Mentor
     */


        private int employeeId;
        private String jobTitle;
        private double salary;

        public Employee(String name, char gender, LocalDate dOB, int employeeId, String jobTitle, double salary) {
            super(name, gender, dOB);
            setEmployeeId(employeeId);
            setJobTitle(jobTitle);
            setSalary(salary);
        }

        public int getEmployeeId() {
            return employeeId;
        }

        public void setEmployeeId(int employeeId) {
            this.employeeId = employeeId;
        }

        public String getJobTitle() {
            return jobTitle;
        }

        public void setJobTitle(String jobTitle) {
            this.jobTitle = jobTitle;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            if(salary < 0){
                return;
            }
            this.salary = salary;
        }

        public void work(){
            System.out.println(getName()+" is working");
        }

        public void attendMeeting(){
            System.out.println(getName()+" is attending meeting");
        }

        @Override
        public String toString() {
            return "Employee{" +
                    super.toString()+
                    "employeeId=" + employeeId +
                    ", jobTitle='" + jobTitle + '\'' +
                    ", salary=" + salary +
                    '}';
        }
    }


/*
 2. Employee
   variables: name, gender, age, dateOfBirth, jobTitle, employeeID, salary

             methods: work(), attendMeeting()
 */