package Week2;

//    swap two variable values without using a third variable, for solution this task I used addition and subtraction.
//    get the sum of two numbers and then if subtract one number from sum, get another number

import java.util.Scanner;
    public class SwapNumbers {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the first number: a = ");
            int a = input.nextInt();
            System.out.print("Enter the second number: b = ");
            int b = input.nextInt();
            a += b;                                                      // a = a + b = 3 + 5 = 8
            b = a - b;                                                   // b = a - b = 8 - 5 = 3
            a -= b;                                                      // a = a - b = 8 - 3 = 5
            System.out.println("result swap: a = " + a + " b = " + b);   // a = 5 b = 3
        }
    }

