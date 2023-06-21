import java.util.Scanner;
public class NDivideWithoutOperators {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        if (num2 == 0)
        {
            System.err.println("Error!! Divisible by 0");
            System.exit(-1);
        }

        int num3 = num1;
        int result = 0;
        int count = 0;

        while (num1 >= num2) {
            result = num1 - num2;
            num1 = result;
            count++;
        }

        System.out.println("The division of " + num3 + " by " + num2 + " is: " + count);
    }
}

/*
Write a method that can divide two numbers without using division operator
 */
