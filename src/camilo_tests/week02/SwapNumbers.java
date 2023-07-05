package camilo_tests.week02;

import java.util.Scanner;
/*
Swap two variable' values without using a third variable
 */

public class SwapNumbers {

    public static void main(String[] args) {
        numberSwap();
    }

    public static void numberSwap() {

        System.out.print("Enter first number: ");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        num1 = num1 * num2;
        num2 = num1 / num2;
        num1 = num1 / num2;

        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
    }
}

