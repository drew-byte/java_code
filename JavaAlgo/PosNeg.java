import java.util.Scanner;

public class PosNeg {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        String str = (a >= 1) ? "The integer is positive!"
                : (a < 0) ? "The integer is negative!" : "The integer is the origin integer!";

        System.out.println(str);
    }
}
