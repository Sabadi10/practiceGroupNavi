package Larbi;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        swap();
    }

    public static void swap(){

        System.out.print("Enter the first number: ");
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scan.nextInt();

        num1 = num1 + num2; // 30
        num2 = num1 - num2; // 10
        num1 = num1 - num2; //

        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);

    }

}
