package DA;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import List.Job;

public class JobDA {

    ArrayList<Job> jobList;

    public JobDA(String jobCode) throws FileNotFoundException {

        Scanner sc = new Scanner(new FileReader("C:/Users/Shane/Documents/GitHub/java_code/SE Lab 2/CSV/JOBFILE.csv"));
        jobList = new ArrayList<Job>();

        while (sc.hasNext()) {

            String row = new String();
            row = sc.nextLine();
            String[] specificRow = new String[2];
            specificRow = row.split(",");

            Job job = new Job();

            if (jobCode.contentEquals(specificRow[0])) {
                job.setDescription(specificRow[1]);
                jobList.add(job);
            }

        }
    }

    public ArrayList<Job> getJobList() {
        return jobList;
    }

    public void setJobList(ArrayList<Job> jobList) {
        this.jobList = jobList;
    }
}
