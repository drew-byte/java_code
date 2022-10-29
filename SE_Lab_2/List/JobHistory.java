package List;

import java.util.ArrayList;

public class JobHistory {

    private ArrayList<Job> job;
    private ArrayList<Department> department;
    private Double salary;
    private String effectiveDate;

    public ArrayList<Job> getJob() {
        return job;
    }

    public void setJob(ArrayList<Job> job) {
        this.job = job;
    }

    public ArrayList<Department> getDepartment() {
        return department;
    }

    public void setDepartment(ArrayList<Department> department) {
        this.department = department;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }
}
