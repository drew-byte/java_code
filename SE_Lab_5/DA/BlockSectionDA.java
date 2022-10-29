package DA;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

import List.BlockSection;
import List.Course;
import List.Student;

public class BlockSectionDA {

    BlockSection blockSection = new BlockSection();

    public BlockSection getBlockSection() {
        return blockSection;
    }

    public BlockSectionDA() throws FileNotFoundException {

        Scanner sc = new Scanner(
                new FileReader("C:/Users/Shane/Documents/GitHub/java_code/SE_Lab_5/csv/blockSectionInfo.csv"));

        while (sc.hasNext()) {

            String row = "";
            row = sc.nextLine();

            String array[];
            array = row.split(",");

            blockSection.setBlockCode(array[0]);
            blockSection.setDescription(array[1]);
            blockSection.setAdviser(array[2]);

        }

    }

    public void printer() throws FileNotFoundException {

        StudentDA studentDA = new StudentDA();

        for (Student student : studentDA.getStudentList()) {
            System.out.println(
                    "\nStudent Number: " + student.getStudentNumber() + "\t\t\tStudent Name: " + student.getName());
            System.out.println("\nSchedule: ");
        
            for (Course course : student.getCourseList()) {
                System.out.println(course.getCourseCode() + "   " + course.getDescription() + "   " + course.getUnit()
                        + "   " + course.getDay() + "   " + course.getTime());

            }
            System.out.println("___________________________________________________________________________");

        }
    }

}
