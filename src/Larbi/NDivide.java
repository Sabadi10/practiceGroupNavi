package Larbi;

import java.util.Scanner;

public class NDivide{

    public static void main(String[] args) {

        // Write a method that can divide two numbers without using division operator

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        int num3 = num1;
        int result = 0;
        int count = 0;

        while(num1 >= num2){
            result = num1 - num2;
            num1 = result;
            count++;
        }

        System.out.println("The division of " + num3 + " by " + num2 + " is: " + count);

    }

}