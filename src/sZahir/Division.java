package sZahir;
//Write a method that can divide two numbers without using division operator
public class Division {


        public static int divide (int numerator, int denominator) {
            if (denominator == 0 || numerator==0) {
                throw new ArithmeticException("cannot divide by zero");
            }
            //ensure that the signs of both num and denominator are the same

            int sign = ((numerator < 0) || (denominator < 0)) ? -1 : 1;

            //to ensure all numbers are positive convert them to positive by taking the absolute of both
            numerator = Math.abs(numerator);
            denominator = Math.abs(denominator);

            //create a variable to hold the answer
            int quotient = 0;

            //create a while loop to ensure that we can subtract the denominator from the numerator

            while (numerator >= denominator) {
                numerator -= denominator;
                quotient++;
            }
            return sign * quotient;
        }

        public static void main(String[] args) {

            int result=divide(50,2);
            System.out.println("Result:" + result);
        }
    }
