package Larbi.week03;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {

        // Numbers - Prime Number
        // Write a method that can check if a number is prime or not

        // Prime numbers: are the number that only divided by their self and by 1

        System.out.println(primeNum());

    }

    public static boolean primeNum(){
        System.out.print("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        boolean isPrime = false;

        for (int i = 2; i < number ; i++) {
            if(number%i != 0) {
                isPrime = true;
            }else{
                isPrime = false;
                break;
            }

        }
        return isPrime;
    }
}
