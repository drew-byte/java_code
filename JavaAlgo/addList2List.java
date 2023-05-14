import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class addList2List  {

    static List<String> account = new ArrayList<>(Arrays.asList("drew", "byte", "xd"));
    static List<String> password = new ArrayList<>(Arrays.asList("1234", "5678", "9101"));
    static List<String> bMonth = new ArrayList<>(Arrays.asList("February", "January", "March"));
    static List<Integer> bDay = new ArrayList<>(Arrays.asList(21, 1, 24));
    static List<Integer> bYear = new ArrayList<>(Arrays.asList(2003, 2006, 2023));
    static List<String> gen = new ArrayList<>(Arrays.asList("male", "female", "secret"));

    addList2List() {
        System.out.println("\n----------Welcome to Doxi!----------\n");
        welcome();
    }

    static void welcome() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Do you have an existing account? [Y/N]: ");
        String answer = sc.nextLine();
        if (answer.equalsIgnoreCase("Y")) {
            login();
        } else if (answer.equalsIgnoreCase("N")) {
            signup();
        }
    }

    static void login() {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("\nInput Username: ");
        String username = sc1.nextLine();
        linearDisplay();
        System.out.println("Verifying Username...");
        if (account.contains(username)) {
            System.out.println("Username verified!");
            linearDisplay();
            System.out.print("Input Password: ");
            String pwd = sc1.nextLine();
            linearDisplay();
            if (password.get(account.indexOf(username)).equals(pwd)) {
                System.out.println("Password Verified");
                terminateDisplay();
            } else {
                System.out.println("Wrong Password! \nTry Again!");
                login();
            }
        } else {
            System.out.println("Try again!");
            login();
        }
    }

    static void signup() {
        Scanner sc2 = new Scanner(System.in);
        System.out.println("\n----------New Username----------\n");
        System.out.print("\nInput Username: ");
        String username = sc2.nextLine();
        System.out.print("\nDo you want to proceed? [Y/N]: ");
        String answer = sc2.nextLine();
        if (answer.equalsIgnoreCase("Y")) {
            System.out.println("\nNew username confirmed!");
            account.add(username);
            System.out.println("\n----------New Password----------\n");
            System.out.print("\nInput new password: ");
            String pwd = sc2.nextLine();
            System.out.print("\nDo you want to proceed? [Y/N]");
            String answer2 = sc2.nextLine();
            if (answer2.equalsIgnoreCase("Y")) {
                password.add(pwd);
                System.out.println("\n----------Date of Birth----------\n");
                System.out.print("Input birth month: ");
                String birthM = sc2.nextLine();
                System.out.print("\nInput birth day: ");
                int birthD = sc2.nextInt();
                System.out.print("\nInput birth year: ");
                int birthY = sc2.nextInt();
                sc2.nextLine(); // consume the newline character
                System.out.print("Do you want to proceed?: ");
                String answer3 = sc2.nextLine();
                if (answer3.equalsIgnoreCase("Y")) {
                    bMonth.add(birthM);
                    bDay.add(birthD);
                    bYear.add(birthY);
                    System.out.println("\n-------------Gender-------------\n");
                    String genderArray[] = { "1. Female", "2. Male", "3. Secret" };
                    System.out.println(Arrays.toString(genderArray));
                    System.out.print("What is your gender?: ");
                    String gender = sc2.nextLine();
                    System.out.print("Do you want to proceed?: ");
                    String answer4 = sc2.nextLine();
                    if(answer4.equalsIgnoreCase("Y"))
                    {
                        gen.add(gender);
                        System.out.println("\n-------------Terms and Conditions-------------\n");
                        System.out.print("\nDo you aggree in the terms and conditions?: ");
                        String answer5 = sc2.nextLine();
                        if(answer5.equalsIgnoreCase("Y"))
                        {
                            linearDisplay();
                            System.out.println("Confirmed!");
                            linearDisplay();
                            System.out.print("Proceed on creating an account? [Y/N]");
                            String answer6 = sc2.nextLine();
                            if(answer6.equalsIgnoreCase("Y"))
                            {
                                login();
                            }
                            else
                            {
                                terminateDisplay();
                            }
                        }
                        else
                        {
                            signup();
                        }
                    }
                    else
                    {
                        signup();
                    }  
                }
                else
                {
                    signup();
                }
            }
            else
            {
                signup();
            }
        }
        else
        {
            signup();
        }
    }
    static void linearDisplay()
    {
        System.out.println("-------------------------------------");
    }
    static void terminateDisplay()
    {
        System.out.println( "! ! ! ! END ! ! ! !");
    }
    public static void main(String[] args) {
        new addList2List();
    }
    
}

