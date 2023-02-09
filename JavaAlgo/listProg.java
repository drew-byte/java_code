import java.util.ArrayList;
import java.util.Scanner;

public class listProg {

    static ArrayList<String> studId = new ArrayList<>();
    static ArrayList<String> studName = new ArrayList<>();
    static ArrayList<String> college = new ArrayList<>();
    static ArrayList<String> program = new ArrayList<>();

    static String studentString, nameString, collegeString, programString;

    public static void form() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student ID number : ");
        studentString = sc.nextLine();
        while (studentString.isBlank()) {
            System.out.print("Enter Student ID number : ");
            studentString = sc.nextLine();

        }
        studId.add(studentString);

        System.out.print("Enter Student Fullname : ");
        nameString = sc.nextLine();
        while (nameString.isBlank()) {
            System.out.print("Enter Student Fullname : ");
            nameString = sc.nextLine();

        }
        studName.add(nameString);

        System.out.print("Enter Student College : ");
        collegeString = sc.nextLine();
        while (collegeString.isBlank()) {
            System.out.print("Enter Student College : ");
            collegeString = sc.nextLine();

        }
        college.add(collegeString);

        System.out.print("Enter Student Program : ");
        programString = sc.nextLine();
        while (programString.isBlank()) {
            System.out.print("Enter Student Program : ");
            programString = sc.nextLine();

        }
        program.add(programString);

        System.out.print("Do you want to add more participants [ Yes | No ] : ");
        String add = sc.nextLine();

        if (add.equalsIgnoreCase("Yes")) {
            form();
        } else {

            System.out.println("LIST OF STUDENTS PARTICIPANTS");
            System.out.println("ID NUMBER           STUDENT NAME        COLLEGE             PROGRAM");
            for (int i = 0; i < studId.size(); i++) {

                String column1Format = "%-20s";

                String formater = column1Format + " " + column1Format + " " + column1Format + " " + column1Format;

                System.out.format(formater, studId.get(i), studName.get(i), college.get(i), program.get(i));
                System.out.println();

            }

        }

    }

    public static void main(String[] args) {
        form();
    }

}
