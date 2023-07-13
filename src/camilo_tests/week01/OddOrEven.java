package camilo_tests.week01;

import java.util.Scanner;

/*
Numbers- Odd or even:
Write  a method which can identify given number is even or odd
Output ex:
identify(5); ->"Odd"
identify(6); ->"Even"
 */

public class OddOrEven {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // user input
        System.out.println("Enter a number: ");
        int num = input.nextInt(); // used to read the users input

        if (num % 2 == 0) { // checks if the num divisible by 2
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd"); // if remainder is not 0 then it is odd because it is not divisible by 2
        }

    }
}
