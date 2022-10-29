package Main;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import DA.*;
import List.Department;
import List.Employee;
import List.Job;
import List.JobHistory;

class HopeMain {

    public HopeMain() throws FileNotFoundException {
        
        //Andrew Felix Cunanan

        ArrayList<Employee> empList = new ArrayList<Employee>();
        EmployeeDA employeeDA = new EmployeeDA();
        empList = employeeDA.getEmployeeList();

        System.out.println("\n__________________________________________________________"
                + "\n__________________________________________________________\n");

        for (Employee employee : empList) {

            System.out.println(employee.getEmpNo() + " " +
                    employee.getLastName() + " " +
                    employee.getFirstName() + " " +
                    employee.getGender());

            System.out.println("\nJob History of Employee");

            for (JobHistory jobHistory : employee.getJobHist()) {
                for (Job job : jobHistory.getJob()) {
                    System.out.println("\n  " + job.getDescription());
                }
                System.out.println("  " + jobHistory.getEffectiveDate() + " " + jobHistory.getSalary());
                for (Department department : jobHistory.getDepartment()) {
                    System.out.println("\n  Department: " + department.getDepartmentName());
                }
                System.out.println();
            }

            System.out.println("\n__________________________________________________________"
                    + "\n__________________________________________________________\n");
            System.out.println();
        }

    }

    public static void main(String[] args) throws FileNotFoundException {

        new HopeMain();
    }
}