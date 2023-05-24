package camilo_tests;

public class Divide {

    public static void main(String[] args) {


            int number = 65;
            boolean isDivisible2 = number % 2 == 0;

            boolean isDivisible3 = number % 3 == 0;

            boolean isDivisible5 = number % 5 == 0;

            System.out.println(number + " is divisible by 2: " + isDivisible2);
            System.out.println(number + " is divisible by 3: " + isDivisible3);
            System.out.println(number + " is divisible by 5: " + isDivisible5);

        }
    }


/*
Divide without / operator: numbers -
Write a method that can divide two numbers without using division operator
 */