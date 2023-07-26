package SimonaTasks.divideWithoutOperator;

import java.util.Scanner;

public class DivisionNumbers_Scanner {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first positive number:");
        int num1 = scan.nextInt();
        System.out.println("Enter second positive number:");
        int num2 = scan.nextInt();
        int dividend = 0; // deljenik
        int divisor = 0; // delilac
        int result = 0;
        int reminder = 0;


        while (!((num1 > 0) && (num2 > 0))) {
            System.err.println("The number you entered is zero or negative");
            System.out.println("Please try again");
            break;

        }


        if (num1 >= num2) {
            divisor = num1;
            dividend = num2;
        } else {
            divisor = num2;
            dividend = num1;
        }
        while (divisor >= dividend) {
            reminder += divisor % dividend;
            divisor -= dividend;
            result++;
        }
        if (reminder == 0) {
            System.out.println("Result = " + result);
        } else {
            System.out.println("Result = " + result + "." + reminder);
        }

    }
}
