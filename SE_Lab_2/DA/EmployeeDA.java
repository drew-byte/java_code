package DA;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import List.Employee;

public class EmployeeDA {

    private ArrayList<Employee> employeeList;

    public EmployeeDA() throws FileNotFoundException {
        Scanner sc = new Scanner(new FileReader("C:/Users/Shane/Documents/GitHub/java_code/SE Lab 2/CSV/DEPFILE.csv"));

        employeeList = new ArrayList<Employee>();

        while (sc.hasNext()) {
            String row = new String();
            row = sc.nextLine();
            String specificRow[] = new String[7];
            specificRow = row.split(",");

            Employee employee = new Employee();
            employee.setEmpNo(specificRow[0]);
            employee.setLastName(specificRow[1]);
            employee.setFirstName(specificRow[2]);
            employee.setGender(specificRow[3]);

            JobHistDA jobHistDA = new JobHistDA(employee.getEmpNo());

            employee.setJobHist(jobHistDA.getJobHist());

            employeeList.add(employee);
        }
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(ArrayList<Employee> employeeList) {
        this.employeeList = employeeList;
    }

}
