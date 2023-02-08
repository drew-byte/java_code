import java.util.ArrayList;
import java.util.Scanner;
public class listProgram {

    public static void main(String[] args) {

        ArrayList<String> studentid = new ArrayList<String>();
        ArrayList<String> fullname = new ArrayList<String>();
        ArrayList<String> college = new ArrayList<>();
        ArrayList<String> program = new ArrayList<>();

        String studentID;
        String fname;
        String stdcollege;
        String stdprogram;
        Scanner scan = new Scanner(System.in);

        int sum = 0;
        do {
            System.out.print("Enter student ID number : ");
            studentID = scan.nextLine();
            studentid.add(studentID);
            
            System.out.print("Enter student Fullname : ");
            fname = scan.nextLine();
            fullname.add(fname);
            System.out.print("Enter student College : ");
            stdcollege = scan.nextLine();
            college.add(stdcollege);
            System.out.print("Enter student Program : ");
            stdprogram = scan.nextLine();
            program.add(stdprogram);
            System.out.println("Do you want to add more participants YES/NO");
            String add=scan.nextLine();
            if(add.equalsIgnoreCase("Yes")){
                sum=1;
            }
            else
            {
                sum=0;
            }
        } while (sum == 1);
            System.out.println("LIST OF STUDENTS PARTICIPANTS");
            System.out.println("\nID NUMBER\tSTUDENT NAME\tCOLLEGE\tPROGRAM");
            for(int i =0; i<studentid.size(); i++){
                System.out.println(studentid.get(i)+"\t"+fullname.get(i)+"\t"+college.get(i)+"\t"+program.get(i));
            }
            
    }
}

