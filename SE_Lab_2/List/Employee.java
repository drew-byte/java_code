package List;

import java.util.ArrayList;

public class Employee {

    private String empNo;
    private String lastName;
    private String firstName;
    private String gender;

    private ArrayList<JobHistory> jobHist;

    public ArrayList<JobHistory> getJobHist() {
        return jobHist;
    }

    public void setJobHist(ArrayList<JobHistory> jobHist) {
        this.jobHist = jobHist;

    }

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
