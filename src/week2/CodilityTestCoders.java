package week2;

public class CodilityTestCoders {

    static int N = 45;

    public static void main(String[] args) {
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                System.out.print("Codility");
                if (i % 3 == 0) {
                    System.out.print("Test");
                }

                if (i % 5 == 0) {
                    System.out.print("Coders");
                }
                System.out.println();
                continue;
            }

            if (i % 3 == 0) {
                System.out.print("Test");
                if (i % 2 == 0) {
                    System.out.print("Codility");
                }

                if (i % 5 == 0) {
                    System.out.print("CODERS");
                }
                System.out.println();
                continue;
            }

            if (i % 5 == 0) {
                System.out.print("CODERS");
                if (i % 2 == 0) {
                    System.out.print("CODILITY");
                }

                if (i % 3 == 0) {
                    System.out.print("TEST");
                }
                System.out.println();
                continue;
            } else {
                System.out.println(i);
            }
        }
    }
}

/*
Write a function that given a positive integer N prints the consecutive numbers
from 1 to n  each on separate lines
- if the numbers is divisible by more than one of the numbers 2,3,5 etc
it should print Codility, Test, Coders

 */