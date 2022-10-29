import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class hashCode {
    static String[] name = { "Andrew", "Juan", "Mia", "Anne", "Mark" };
    static int[] age = { 19, 20, 15, 25, 18 };
    static String[] gender = { "Male", "Male", "Female", "Female", "Male" };
    static int[] yearLevel = { 1, 2, 3, 4, 5 };

    public void display1(String[] name) {
        for (int i = 1; i <= name.length; i++) {
            System.out.print(name[i - 1] + "\t");

        }
        System.out.println();

    }

    public void display2(int[] age) {
        for (int i = 1; i <= age.length; i++) {
            System.out.print(age[i - 1] + "\t");

        }
        System.out.println();

    }

    public void display3(String[] gender) {
        for (int i = 1; i <= gender.length; i++) {
            System.out.print(gender[i - 1] + "\t");

        }
        System.out.println();

    }

    public void display4(int[] yearLevel) {
        for (int i = 1; i <= yearLevel.length; i++) {
            System.out.print(yearLevel[i - 1] + "\t");

        }
        System.out.println();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        hashCode arr = new hashCode();
        String CONSTANT = "<====================>";

        arr.display1(name);
        arr.display2(age);
        arr.display3(gender);
        arr.display4(yearLevel);
        System.out.println(CONSTANT);
        String CONSTANTNAME = "Name is: ";
        String CONSTANTAGE = "Age is: ";
        String CONSTANTGENDER = "Gender is: ";
        String CONSTANTYEARLEVEL = "Number is: ";

        System.out.println();
        System.out.println("SEARCHING AND SORTING IN STATIC ARRAYS");
        System.out.println();
        System.out.print("Name: ");
        String a1 = sc.nextLine();

        for (int i = 0; i < name.length; i++) {
            String row = name[i] + age[i] + gender[i] + yearLevel[i];
            if (row.contains(a1)) {
                System.out.println();
                System.out.println(CONSTANT);
                System.out.println(CONSTANTNAME + name[i] + "\n" + CONSTANTAGE + age[i] + "\n" + CONSTANTGENDER
                        + gender[i] + "\n" + CONSTANTYEARLEVEL + yearLevel[i]);
            }

        }
        System.out.println(CONSTANT);
        System.out.println();
        System.out.print("Name: ");
        String b1 = sc.nextLine();

        for (int i = 0; i < name.length; i++) {
            String row = name[i] + age[i] + gender[i] + yearLevel[i];
            if (row.contains(b1)) {
                System.out.println();
                System.out.println(CONSTANT);
                System.out.println(CONSTANTNAME + name[i] + "\n" + CONSTANTAGE + age[i] + "\n" + CONSTANTGENDER
                        + gender[i] + "\n" + CONSTANTYEARLEVEL + yearLevel[i]);
            }

        }
        System.out.println(CONSTANT);
        System.out.println("ASCENDING ORDER OF NUMBER LIST IN HASHSET");
        HashSet<Integer> hs = new HashSet<Integer>();
        hs.add(3);
        hs.add(5);
        hs.add(1);
        hs.add(2);
        hs.add(4);
        Iterator<Integer> it = hs.iterator();
        while (it.hasNext()) {
            Integer x = it.next();
        }
        System.out.println(hs);
        System.out.println(CONSTANT);
        System.out.println("DESCENDING ORDER OF NUMBER LIST IN ARRAY");
        int[] desc = { 3, 5, 1, 2, 4 };
        for (int i = 0; i < desc.length - 1; i++) {
            for (int j = 0; j < desc.length - 1; j++) {
                if (desc[j] < desc[j + 1]) {
                    int temp = desc[j];
                    desc[j] = desc[j + 1];
                    desc[j + 1] = temp;
                }

            }

        }
        System.out.print("[");
        for (int i = 0; i < desc.length; i++) {

            System.out.print(desc[i] + ", ");
        }
        System.out.println("]");
        System.out.println(CONSTANT);

    }

}
