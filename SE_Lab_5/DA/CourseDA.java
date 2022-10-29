package DA;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import List.Course;

public class CourseDA {

    ArrayList<Course> courseList = new ArrayList<Course>();

    public ArrayList<Course> getCourseList() {
        return courseList;
    }

    public CourseDA(String studentNumber) throws FileNotFoundException {

        Scanner sc = new Scanner(
                new FileReader("C:/Users/Shane/Documents/GitHub/java_code/SE_Lab_5/csv/scheduleInfo.csv"));

        while (sc.hasNext()) {

            Course course = new Course();

            String row = "";
            row = sc.nextLine();

            String array[];
            array = row.split(",");

            if (studentNumber.equals(array[0])) {
                course.setCourseCode(array[1]);
                course.setDescription(array[2]);
                course.setUnit(array[3]);
                course.setDay(array[4]);
                course.setTime(array[5]);

                courseList.add(course);
            }

        }
    }

}
