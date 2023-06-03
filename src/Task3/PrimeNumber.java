package Task3;

import java.util.Scanner;

public class PrimeNumber {
    //Check if the input number is prime or not.
    //I create a method to check if the input number is prime or not by using a for loop
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = input.nextInt();

        System.out.println(num + " is a Prime number? " + isPrimeNum(num));
    }

    public static Boolean isPrimeNum(int num) {
        String result = "";
        boolean isPrime = false;
        if (num <= 1) {
            isPrime = false;

        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                } else {
                    isPrime = true;

                }
            }
        }
        return isPrime;
    }
}
