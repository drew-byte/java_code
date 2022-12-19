import java.util.Scanner;

class Main {

    public static void choices() {
        line();
        System.out.println("Menu");
        String choice[] = { "Coffee", "Soda", "Water" };
        int price[] = { 50, 50, 20 };
        for (int i = 0; i < choice.length; i++) {
            System.out.println("[" + (i + 1) + "] " + choice[i] + " " + price[i]);

        }
        line();
        Scanner sc = new Scanner(System.in);
        System.out.print("Select [1-3]: ");
        int answer = sc.nextInt();
        int bill;
        switch (answer) {
            case 1:
                Price p1 = Price.Coffee;
                System.out.println("Your bill mate is " + p1.value);
                bill = p1.value;
                receipt(bill);
                break;
            case 2:
                Price p2 = Price.Soda;
                System.out.println("Your bill mate is " + p2.value);
                bill = p2.value;
                receipt(bill);
                break;
            case 3:
                Price p3 = Price.Water;
                System.out.println("Your bill mate is " + p3.value);
                bill = p3.value;
                receipt(bill);
                break;
            default:
                System.out.println("We dont have what you want mate");
                break;
        }
        line();

    }

    public static void receipt(int bill) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Payment? : ");
        int money = sc.nextInt();

        if (money >= bill) {
            money -= bill;
            System.out.println( "Thank you come again your exchange is " + money);
        }
        else
        {
            System.out.println("We have a problem here mate!");
            System.out.println("Get out of here or I kick your arse mate!");
        }

    }
    public static void line()
    {
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        choices();
    }

}