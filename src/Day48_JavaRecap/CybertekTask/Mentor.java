package Day48_JavaRecap.CybertekTask;

import java.time.LocalDate;

public final class Mentor extends Employee{
    public Mentor(String name, char gender, LocalDate dOB, int employeeId, String jobTitle, double salary) {
        super(name, gender, dOB, employeeId, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+getName()+" is mentoring");
    }

    @Override
    public void attendMeeting() {
        System.out.println(getJobTitle()+" "+getName()+" is attending mentoring meeting");

    }
}
