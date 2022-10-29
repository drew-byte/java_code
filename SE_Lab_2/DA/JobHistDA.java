package DA;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import List.JobHistory;

public class JobHistDA {

    private ArrayList<JobHistory> jobHistList;

    public JobHistDA(String employeeNo) throws FileNotFoundException
    {
        Scanner sc = new Scanner(new FileReader("C:/Users/Shane/Documents/GitHub/java_code/SE Lab 2/CSV/JOBHISTFILE.csv"));
        jobHistList = new ArrayList<JobHistory>();
 
        while(sc.hasNext())
        {
            String row = new String();
            row = sc.nextLine();
            String specificRow[] = new String[5];
            specificRow = row.split(",");

            JobHistory jobHistory = new JobHistory();

            if (employeeNo.contentEquals(specificRow[0])) {

                jobHistory.setSalary(Double.parseDouble(specificRow[3]));
                jobHistory.setEffectiveDate(specificRow[2]);
                JobDA jobDA = new JobDA(specificRow[1]);

                jobHistory.setJob(jobDA.getJobList());
                DepartmentDA departmentDA = new DepartmentDA(specificRow[4]);
                
                jobHistory.setDepartment(departmentDA.getDepartmentList());
                jobHistList.add(jobHistory);
            }
                


        }
    }

    public ArrayList<JobHistory> getJobHist() {
        return jobHistList;
    }

    public void setJobHis(ArrayList<JobHistory> jobHistList) {
        this.jobHistList = jobHistList;
    }

}
