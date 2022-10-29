package DA;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import List.Department;

public class DepartmentDA {

    private ArrayList<Department> departmentList;

    public DepartmentDA(String deptCode) throws FileNotFoundException {
        Scanner sc = new Scanner(new FileReader("C:/Users/Shane/Documents/GitHub/java_code/SE Lab 2/CSV/DEPFILE.csv"));
        departmentList = new ArrayList<Department>();

        while (sc.hasNext()) {

            String row = new String();
            row = sc.nextLine();
            String specificRow[] = new String[2];
            specificRow = row.split(",");

            Department department = new Department();

            if (deptCode.contentEquals(specificRow[0])) {
                department.setDepartmentName(specificRow[1]);
                departmentList.add(department);
            }
        }

    }

    public ArrayList<Department> getDepartmentList() {
        return departmentList;
    }

    public void setDepartmentList(ArrayList<Department> departmentList) {
        this.departmentList = departmentList;
    }

}