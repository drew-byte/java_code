import java.util.Scanner;

class Main {

    static Bike bike = new Bike();

    public static void choice() {
        System.out.println("Select a color for your roadbike!");
        String a[] = { "Red", "Green", "Blue" };
        int i = 1;
        for (String select : a) {
            System.out.println("[" + i + "] " + select);
            i++;
        }
        bike.breakLine();
        answer();
    }

    public static void answer() {
        Scanner sc = new Scanner(System.in);
        System.out.print("ANSWER: ");
        String a = sc.nextLine();
        String b = a;
        a = a.equals("1") ? "Your answer is Red!"
                : a.equals("2") ? "Your answer is Green!" : a.equals("3") ? "Your answer is Blue!" : "Sorry try again";
        System.out.println(a);
        bike.breakLine();
        if (b.equals("1")) {
            b = "Red!";
        } else if (b.equals("2")) {
            b = "Green!";
        } else if (b.equals("3")) {
            b = "Blue!";
        } else {
            choice();
        }

        Color color = new Color(b);
        bike.theColor(color);

    }

    public static void main(String[] args) {
        choice();
    }
}