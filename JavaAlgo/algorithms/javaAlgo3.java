import java.util.Scanner;

public class javaAlgo3 {
    
    static int indexArray[] = new int[50];
    static int arraySize = 10;
    static int temp = 0, index = 0, value = 0;


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

        insertValue();
    }
    public static void main(String[] args) {
        
        generateRandomArray();
    }
    public static void insertValue()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a Value:");
        value = sc.nextInt();


        if(arraySize < 20)
        {
            indexArray[arraySize] = value;
            arraySize++;

        }
        printIndexAndValue();
    }
}
