package Converters;

import java.util.Scanner;
import java.util.Stack;

public class conversion2 {
    static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        converter(x);
       

    }

    public static void converter(int x) {

        while (x != 0) {
            int decimal = x % 2;
            stack.push(decimal);
            x /= 2;
        }
        while (!(stack.isEmpty())) {
            System.out.print(stack.pop());
        }

    }

   

}
