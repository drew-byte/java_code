import java.util.ArrayList;
import java.util.Scanner;

class Main {

    static ArrayList<Reservation> reserve = new ArrayList<>();

    public static void main(String[] args) {

        new Main();

    }

    Main() {

        menu();

    }

    static void linearDisplay() {
        System.out.println("--------------------------------------");
    }

    static void menu() {

        System.out.println("\nSystem Menu");
        System.out.println("\n\n\ta.  View all Reservations");
        System.out.println("\tb.  Make Reservation");
        System.out.println("\tc.  Delete Reservation");
        System.out.println("\td.  Generate Report");
        System.out.println("\te.  Exit");

        Scanner sc = new Scanner(System.in);
        System.out.print("\nInput your choice [a-e]: ");
        String ans = sc.nextLine();

        switch (ans) {
            case "a":
                viewReservations();
                break;

            case "b":
                makeReservations();
                break;

            case "c":
                deleteReservation();
                break;

            case "d":
                generateReport();
                break;

            case "e":
                exit();
                break;

        }

    }

    static void viewReservations() {
        if (reserve.isEmpty()) {
            System.out.println("\n---------- No Data Found ----------\n");

        } else {
            System.out.println("");
            System.out.printf("%-5s %-10s %-10s %-10s %-10s %-10s%n", "ID", "DATE", "TIME", "NAME", "ADULTS",
                    "CHILDREN");
            int id = 1;
            for (Reservation R : reserve) {
                String newName = R.getName();
                String newDate = R.getDate();
                String newTime = R.getTime();
                int newAdults = R.getNumOfAdults();
                int newChildren = R.getNumOfChildren();

                System.out.printf("%-5s %-10s %-10s %-10s %-10s %-10s%n", id, newDate, newTime, newName, newAdults,
                        newChildren);
                id++;
            }

        }
        menu();

    }

    static void makeReservations() {

        Scanner sc = new Scanner(System.in);
        System.out.print("\nName: ");
        String inputName = sc.nextLine();
        System.out.print("\nDate: ");
        String inputDate = sc.nextLine();
        System.out.print("\nTime: ");
        String inputTime = sc.nextLine();
        System.out.print("\nNo of Adults: ");
        int inputAdults = sc.nextInt();
        System.out.print("\nNo of Children: ");
        int inputChildren = sc.nextInt();

        reserve.add(new Reservation(inputName, inputDate, inputTime, inputAdults, inputChildren));
        System.out.println("\n--------- Reservation Added ---------\n");
        menu();

    }

    static void deleteReservation() {
        if (reserve.isEmpty()) {
            System.out.println("\n---------- No Data Found ----------\n");
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the ID of the reservation to delete: ");
            int id = sc.nextInt();
            if (id >= 1 && id <= reserve.size()) {
                reserve.remove(id - 1);
                System.out.println("Reservation with ID " + id + " deleted successfully.");
            } else {
                System.out.println("Invalid ID. No reservation found.");
            }
        }
        menu();
    }

    static void generateReport() {
        if (reserve.isEmpty()) {
            System.out.println("\n---------- No Data Found ----------\n");

        } else {
            System.out.println("");
            System.out.printf("%-5s %-10s %-10s %-10s %-10s %-10s %-10s%n", "ID", "DATE", "TIME", "NAME", "ADULTS",
                    "CHILDREN", "SUBTOTAL");

            int id = 1, adults = 0, child = 0, subtotal = 0;
            for (Reservation R : reserve) {
                String newName = R.getName();
                String newDate = R.getDate();
                String newTime = R.getTime();
                int newAdults = R.getNumOfAdults();
                int newChildren = R.getNumOfChildren();

                int formulaAdults = newAdults * 500;
                int formulaChildren = newChildren * 300;
                int formulaSubtotal = formulaAdults + formulaChildren;

                System.out.printf("%-5s %-10s %-10s %-10s %-10s %-10s %-10s%n", id, newDate, newTime, newName,
                        newAdults, newChildren, formulaSubtotal);
                id++;

                adults += newAdults;
                child += newChildren;
                subtotal += formulaSubtotal;
            }
            System.out.println("\nTotal number of Adults: " + adults);
            System.out.println("Total number of Kids: " + child);
            System.out.println("Grand Total: PHP " + subtotal);
            System.out.println("\n-------------NOTHING FOLLOWS-------------\n");

        }
        menu();

    }

    static void exit() {
        System.out.println("\n------------------Thank You-------------------\n");
    }
}