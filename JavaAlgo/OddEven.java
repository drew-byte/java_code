import java.util.Scanner;

class OddEven {

    public static void checker(int n) {
        String a = (n % 2 == 0) ? "Odd Number" : "Even Number";
        System.out.println(a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        checker(n);

    }
}