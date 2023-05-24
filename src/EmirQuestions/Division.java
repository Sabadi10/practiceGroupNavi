package EmirQuestions;

import java.util.Scanner;
public class Division {

    public static int divide(int dividend, int divisor) {
        // Handle division by zero
        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }

        // Determine the sign of the result
        int sign = (dividend < 0) ^ (divisor < 0) ? -1 : 1;

        // Convert both dividend and divisor to positive values
        long positiveDividend = Math.abs((long) dividend);
        long positiveDivisor = Math.abs((long) divisor);

        // Edge case: dividend is smaller than divisor
        if (positiveDividend < positiveDivisor) {
            return 0;
        }

        long quotient = 0;
        while (positiveDividend >= positiveDivisor) {
            long temp = positiveDivisor;
            long multiple = 1;
            while (positiveDividend >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }
            positiveDividend -= temp;
            quotient += multiple;
        }

        // Apply the sign to the quotient
        quotient *= sign;

        // Handle integer overflow
        if (quotient > Integer.MAX_VALUE || quotient < Integer.MIN_VALUE) {
            throw new ArithmeticException("Integer overflow occurred");
        }

        return (int) quotient;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the dividend: ");
        int dividend = scanner.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        scanner.close();

        int result = divide(dividend, divisor);
        System.out.println("Result: " + result);
    }


}

