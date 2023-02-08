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
            String fs = "               ";
            System.out.println("LIST OF STUDENTS PARTICIPANTS");
            System.out.println("ID NUMBER"+fs+"STUDENT NAME"+fs+"COLLEGE"+fs+"PROGRAM");
            for (int i = 0; i < studId.size(); i++) {

                int space = 20;
                String str1 = " ";
                String str2 = " ";
                String str3 = " ";

                for (int space1 = studId.size(); space1 < space - 1; space1++) {

                    str1 += " ";
                    
                }
                for (int space2 = studName.size(); space2 < space - 1; space2++) {

                    str2 += " ";
                }
                for (int space3 = college.size(); space3 < space - 1; space3++) {

                    str3 += " ";
                }

                System.out.println(
                        studId.get(i) + str1 + studName.get(i) + str2 + college.get(i) + str3 + program.get(i));
            }
        }

    }

    public static void main(String[] args) {
        form();
    }

}
