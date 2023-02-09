import java.util.Scanner;

public class javaAlgo2 {

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

        deleteIndex();
        
    }

    public static void deleteIndex() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input Index: ");
        int index = sc.nextInt();
        System.out.println("------------");
        if (index < arraySize) {
            for (int i = index; i < arraySize - 1; i++) {
                indexArray[i] = indexArray[i + 1];

            }
        }
        arraySize--;

        for (int i = 0; i < arraySize; i++) {

            System.out.println(" | " + i + " | " + indexArray[i] + " | ");
        }
        System.out.println("------------");
    }
}
