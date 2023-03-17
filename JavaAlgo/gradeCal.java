import java.util.Scanner;

class gradeCal {
    String avg = "";
    String num = "";
    String nameS = "";
    String compAvg = "";
    int numPassed = 0;
    int numFailed = 0;

    gradeCal() {
        getStudentName();
    }

    public void getStudentName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        getStudentGrade(name);
    }

    public void getStudentGrade(String name) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Grade in ENGLISH: ");
        double english = sc.nextDouble();
        System.out.print("Grade in MATH: ");
        double math = sc.nextDouble();
        System.out.print("Grade in SCIENCE: ");
        double science = sc.nextDouble();
        System.out.print("Grade in HISTORY: ");
        double history = sc.nextDouble();
        System.out.print("Grade in PE: ");
        double pe = sc.nextDouble();

        double average = (english + math + science + history + pe) / 5;

        getAverageRate(english, math, science, history, pe, average, name);

    }

    public void getAverageRate(double a, double b, double c, double d, double e, double f, String name) {
        String remarks = "";
        if (f >= 75) {
            remarks += "Passed";
        } else {
            remarks += "Failed";
        }

        Double array[] = { a, b, c, d, e };

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] >= 75) {
                numPassed++;
            } else {
                numFailed++;
            }

        }

        nameS += "Name of student: " + name;
        compAvg += "Computed Average: " + f;
        avg += "Average Remarks: " + remarks;
        num += "Number of Passed " + numPassed + " Number of Failed " + numFailed;

        toString(nameS, compAvg, avg, num);

    }

    public static void toString(String a, String b, String c, String d) {
        System.out.println("----------\n" + a + "\n" + b + "\n" + c + "\n" + d + "\n----------");

    }

    public static void main(String[] args) {

        new gradeCal();

    }
}