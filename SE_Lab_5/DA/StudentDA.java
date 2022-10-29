package DA;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import List.Student;

public class StudentDA {

    ArrayList<Student> studentList = new ArrayList<>();

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public StudentDA() throws FileNotFoundException {

        Scanner sc = new Scanner(
                new FileReader("C:/Users/Shane/Documents/GitHub/java_code/SE_Lab_5/csv/studentInfo.csv"));

        while (sc.hasNext()) {
            String row = "";
            row = sc.nextLine();

            Student student = new Student();

            String[] array;
            array = row.split(",");

            student.setStudentNumber(array[1]);
            student.setName(array[2]);
            student.setProgram(array[3]);

            CourseDA courseDA = new CourseDA(student.getStudentNumber());

            student.setCourseList(courseDA.getCourseList());
            studentList.add(student);

        }
    }

}
