import java.util.Scanner;

public class zigzagPattern {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 1,j = b; i <= 5; i++) {
            System.out.println(i +" "+ j);
            
            j--;
            
        }
    }
}
