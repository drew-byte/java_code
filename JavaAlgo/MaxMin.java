import java.util.Scanner;

public class MaxMin {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();
        String str = (a1 > a2 && a1 > a3) ? "Max number is the first input!"
                : (a2 > a1 && a2 > a3) ? "Max number is the second input!" : "Maximum numbber is the third input!";

        System.out.println(str);
    }
}
