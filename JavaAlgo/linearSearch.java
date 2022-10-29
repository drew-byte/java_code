import java.util.Scanner;

public class linearSearch {
    
    static int indexArray[] = new int[50];
    static int arraySize = 10;
    static int temp = 0, index = 0, value = 0;
    public static void main(String[] args) {
        generateRandomArray();
    }
    public static void generateRandomArray() {
        for (int i = 0; i < arraySize; i++) {
            indexArray[i] = (int) (Math.random() * 10) + 10;
        }
        printIndexAndValue();
    }

    public static void printIndexAndValue() {
        System.out.println("------------");
        for (int i = 0; i < arraySize; i++) {
            System.out.println(" | " + i + " | " + indexArray[i] + " | ");
        }
        System.out.println("------------");

        linearSearchMethod();
        
    }
    public static void linearSearchMethod()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Value to search: ");
        value = sc.nextInt();

        for (int i = 0; i < arraySize; i++) {

            if(indexArray[i] == value)
            {
                System.out.println("The value is in the index " + i);
            }
            
        }

    }
}
