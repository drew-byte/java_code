package MainPackage;

import java.util.Scanner;


import FirstStudentPackage.firstStudent;
import SecondStudentPackage.secondStudent;
import ThirdStudentPackage.thirdStudent;

public class main {

    private static String array[];

    public static void main(String[] args) {

        new main();

    }

    main() {
        design();
        firstStudent.getStudentName();
        firstStudent.getGrade();
        design();
        secondStudent.getStudentName();
        secondStudent.getGrade();
        design();
        thirdStudent.getStudentName();
        thirdStudent.getGrade();
        design();
        choices();
        design();
    }

    public static void choices() {
        String array[] = { "", "", "", "" };
        array[0] = firstStudent.displayName();
        array[1] = secondStudent.displayName();
        array[2] = thirdStudent.displayName();
        array[3] = "EXIT";
        System.out.println("Which student would you like to check?\n");
        int x = 1;
        for (int i = 0; i < 3; i++) {
            System.out.println("     " + "[" + x + "] " + array[i]);
            x++;

        }
        Scanner sc = new Scanner(System.in);
        design();
        System.out.print("Student Name: ");
        String name = sc.nextLine();
        if (name.equalsIgnoreCase(array[0])) {
            System.out.println("Grade : ");
            System.out.println("\tPhysics101: " + firstStudent.displayGrade1());
            System.out.println("\tAlgebra101: " + firstStudent.displayGrade2());
            System.out.println("\tProgramming: " + firstStudent.displayGrade3());
            System.out.println(firstStudent.displayGwa());

        } else if (name.equalsIgnoreCase(array[1])) {
            System.out.println("Grade : ");
            System.out.println("\tPhysics101: " + secondStudent.displayGrade1());
            System.out.println("\tAlgebra101: " + secondStudent.displayGrade2());
            System.out.println("\ttProgramming: " + secondStudent.displayGrade3());
            System.out.println(secondStudent.displayGwa());

        } else if (name.equalsIgnoreCase(array[2])) {
            System.out.println("Grade : ");
            System.out.println("\tPhysics101: " + thirdStudent.displayGrade1());
            System.out.println("\tAlgebra101: " + thirdStudent.displayGrade2());
            System.out.println("\tProgramming: " + thirdStudent.displayGrade3());
            System.out.println(thirdStudent.displayGwa());

        } else if (name.equalsIgnoreCase("EXIT")) {

            System.out.println("Program Terminated");

        }

    }

    public static void design() {
        System.out.println("------------------------------");
    }

}
