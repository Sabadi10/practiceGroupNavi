package emirQuestions2;

import java.util.Scanner;

/*
Swap two variables without using a third variable
 */

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

        // first number: 10 , second number: 2

        num1 = num1 * num2; // 20 = 10*2
        num2 = num1 / num2; // 10 = 20/2
        num1 = num1 / num2; // 2 = 20/10

        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);

    }
}
