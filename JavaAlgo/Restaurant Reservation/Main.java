import java.util.ArrayList;
import java.util.Scanner;

class Main {
    
    static String choices[] = { "a.  View all Reservations", "b.  Make Reservation", "c.  Delete Reservation",
    "d.  Generate Report", "e.  Exit" };
    
    static ArrayList<Reservation> reserve = new ArrayList<>();

    Main() {
        menu();
    }

    static void linearDisplay() {
        System.out.println("--------------------------------------");
    }

    static void menu() {
        linearDisplay();
        System.out.println("\nSystem Menu\n\n");
        for (String string : choices) {
            System.out.println("\t" + string);
        }
        System.out.println();
        linearDisplay();
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
            default:
                System.out.println("Please try again invalid input!");
                menu();
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
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("\nName: ");
            String inputName = sc.nextLine();
            System.out.print("Date: ");
            String inputDate = sc.nextLine();
            System.out.print("Time: ");
            String inputTime = sc.nextLine();
            System.out.print("No of Adults: ");
            int inputAdults = sc.nextInt();
            System.out.print("No of Children: ");
            int inputChildren = sc.nextInt();
            reserve.add(new Reservation(inputName, inputDate, inputTime, inputAdults, inputChildren));
            System.out.println("\n--------- Reservation Added ---------\n");
        } catch (Exception e) {
            linearDisplay();
            System.out.println("Invalid input. Please input an integer!");
            System.out.println("This is another form please fill up correctly!");
            linearDisplay();
            makeReservations();
        } finally {
            Scanner sc = new Scanner(System.in);
            System.out.print("Do you want to add more? [Y/N]: ");
            String ans = sc.nextLine();
            if (ans.equalsIgnoreCase("Y")) {
                makeReservations();
            } else if (ans.equalsIgnoreCase("N")) {
                menu();
            }
        }

    }

    static void deleteReservation() {
        deleteMenu();
        linearDisplay();
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

    static void deleteMenu() {
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
        }

    }

    static void generateReport() {
        if (reserve.isEmpty()) {
            System.out.println("\n----------- No Data Found -----------\n");

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

            String toString = "";

            toString += "\nTotal number of Adults: " + adults + "\nTotal number of Kids: " + child
                    + "\nGrand Total: PHP " + subtotal;
            System.out.println(toString + "\n\n-------------NOTHING FOLLOWS-------------\n");

        }
        menu();

    }

    static void exit() {
        System.out.println("\n-------------Thank You-------------\n");
    }
    public static void main(String[] args) {
        new Main();
    }
}