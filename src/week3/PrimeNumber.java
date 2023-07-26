package week3;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        while (true) {

            Scanner scan1 = new Scanner(System.in);
            System.out.print("Enter a number : ");
            int n = scan1.nextInt();


            if (CheckPrime(n)) {
                System.out.println(n + " is a prime number");

            } else {
                System.err.println(n + " is not a prime number");
            }
        }
    }


    public static boolean CheckPrime ( int n){
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}


