public class Ndivide {
    public static int divide(int x, int y) {
        if (y == 0) {
            throw new ArithmeticException("cannot divide by zero");
        }

        int a = 1;
        if (x * y < 0) {
            a = -1;
        }

        x = Math.abs(x);
        y = Math.abs(y);


        int quotient = 0;

        while (x >= y) {
            x = x - y;      // perform a reduction on the dividend
            quotient++;     // increase quotient by 1
        }

        System.out.println("The remainder is " + x);
        return a * quotient;
    }

    public static void main(String[] args) {
        int dividend = 11;
        int divisor = -3;

        System.out.println("The quotient is " + divide(dividend, divisor));
    }
}
