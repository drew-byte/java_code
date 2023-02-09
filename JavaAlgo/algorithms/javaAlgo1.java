import java.util.Scanner;

class javaAlgo1 {

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

        insertIndexandValuetoUpdate();
    }

    public static void insertIndexandValuetoUpdate() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Index: ");
        index = sc.nextInt();
        System.out.print("Input Value: ");
        value = sc.nextInt();

        System.out.println("------------");
        indexArray[index] = value;
       
        
        for (int i = 0; i < arraySize; i++) {

            if(index == i)
            {
    
                indexArray[i+1] = indexArray[i];
                 
                
            } 

            System.out.println(" | " + i + " | " + indexArray[i] + " | ");

        }
           System.out.println("------------");

    }

}