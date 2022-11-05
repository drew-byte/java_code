package SecondStudentPackage;

import java.util.Scanner;

public class secondStudent {
    private static String firstName, lastName, display;
    private static Integer g1, g2, g3, gwa;

    public static void getStudentName() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Name: ");
        firstName = sc.nextLine();
        System.out.print("Enter Last Name: ");
        lastName = sc.nextLine();

    }

    public static void getGrade() {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter Grade at Physics101: ");
        g1 = sc1.nextInt();
        System.out.print("Enter Grade at Algebra101: ");
        g2 = sc1.nextInt();
        System.out.print("Enter Grade at Programming: ");
        g3 = sc1.nextInt();

    }

    public static void boundary() {
        System.out.println("\n------------------------------\n");
    }

    public static int displayGrade1() {
        return g1;

    }

    public static int displayGrade2() {
        return g2;

    }

    public static int displayGrade3() {
        return g3;

    }

    public static String displayGwa() {
        gwa = (g1 + g2 + g3) / 3;

        System.out.println("Your GWA is " + gwa);

        display = gwa >= 75 ? "Passed!" : "Not Passed";

        return display;
    }

    public static String displayName() {
        return firstName + " " + lastName;
    }
}
