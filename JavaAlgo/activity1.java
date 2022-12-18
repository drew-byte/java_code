import java.util.Scanner;

class Main {

    Main(){
        printer();
        Scanner sc = new Scanner(System.in);
        System.out.print("\nWhat is your name: ");
        String name = sc.nextLine();
        System.out.println("Hello ," + name + "!\n");
        choices();
    }

    public static void choices() {
        printer();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("\nTell me what you want to do. Here are your options");
        System.out.println("[1] LEAP YEAR or NOT ");
        System.out.println("[2] HEIGHT COMPARISON of 3 Persons ");
        System.out.println("[3] Limit for Fibbonacci ");
        System.out.println("[4] Diamond of asterisk length ");
        System.out.print("\nANSWER : ");

        int answer = sc1.nextInt();
        switch (answer) {
            case 1:
                getLeapYear();
                choices();
                break;
            case 2:
                heightComparison();
                choices();
                break;
            case 3:
                fibbo();
                choices();
                break;
            case 4:
                diamond();
                choices();
                break;
            default:
                System.out.println("\nTRY AGAIN INPUT [1-4]!");
                break;
        }


    }

    public static void getLeapYear() {
        printer();
        Scanner sc2 = new Scanner(System.in);
        System.out.print("\nWhat is your Birthyear?: ");
        int birthyear = sc2.nextInt();
        String answer = (((birthyear % 4 == 0) && (birthyear % 100 != 0)) ||
                (birthyear % 400 == 0)) ? "Leap Year!" : "Not a Leap Year!";
        System.out.println(answer);
        printer();
    }

    public static void heightComparison() {
        printer();
        Scanner sc3 = new Scanner(System.in);
        int array[] = new int[3];
        for (int i = 0; i < array.length; i++) {
            System.out.print("\nInput the height: ");
            array[i] = sc3.nextInt();
        }
        int i = 0;
        if (array[i] > array[i + 1] && array[i] > array[i + 2]) {
            System.out.println("The highest is the first person!");
        } else if (array[i + 1] > array[i] && array[i + 1] > array[i + 2]) {
            System.out.println("The highest is the second person!");
        } else {
            System.out.println("The highest is the third person!");
        }
        printer();
    }

    public static void fibbo() {
        printer();
        Scanner sc4 = new Scanner(System.in);
        int n = 1, n2 = 1;
        System.out.print("\nInput the limit for fibbonacci: ");
        int limit = sc4.nextInt();

        for (int i = 1; i <= limit; i++) {
            System.out.print(n + " ");
            int next = n + n2;
            n = n2;
            n2 = next;
        }
        System.out.println();
        printer();

    }

    public static void diamond() {

        printer();
        Scanner sc5 = new Scanner(System.in);
        System.out.print("\nInput the rows: ");
        int n = sc5.nextInt();
        int space = n - 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < space; j++)
                System.out.print(" ");

            for (int j = 0; j <= i; j++)
                System.out.print("* ");

            System.out.print("\n");
            space--;
        }

        space = 0;

        for (int i = n; i > 0; i--) {

            for (int j = 0; j < space; j++)
                System.out.print(" ");

            for (int j = 0; j < i; j++)
                System.out.print("* ");

            System.out.print("\n");
            space++;
        }
        printer();
    }
    public static void printer()
    {
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        new Main();
    }

}