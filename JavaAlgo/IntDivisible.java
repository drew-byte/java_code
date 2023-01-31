import java.util.Scanner;

public class IntDivisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String str = (n % 5 == 0) ? "Divisible by 5!" : "Not Divisible by 5!";
        System.out.println(str);
    }
}
