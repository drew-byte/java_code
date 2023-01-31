import java.util.Scanner;

public class VowelChecker {
    public static void main(String[] args) {
        
        char a[] = {'a','e','i','o','u'};

        Scanner sc = new Scanner(System.in);
        char b = sc.next().charAt(0);

        for (int i = 0; i < a.length; i++) {

            if(a[0] == b || a[1] == b || a[2] == b || a[3] == b || a[4] == b)
            {
                System.out.println("Vowel");
                break;

            }
            else
            {
                System.out.println("Not Vowel");
                break;
            }
            
        }
    }
}
