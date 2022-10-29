package Converters;

import java.util.Scanner;

class conversion1 {

    public static void main(String[] args) {


        method();
        
    }

    public static void method() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Lenght of feet: ");
        double f = sc.nextDouble();
        System.out.print("Lenght of Inches: ");
        double i = sc.nextDouble();

        converter(f, i);

    }

    public static void converter(double f, double i) {
        f = f * 30.48;
        i = i * 2.54;
        double result = f + i;
        System.out.println(result);

    }
}