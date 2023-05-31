package camilo_tests;

/*
Write a function that given a positive integer N prints the consecutive numbers
from 1 to n  each on separate lines
- if the numbers is divisible by more than one of the numbers 2,3,5 etc.
it should print:  Codility, Test, Coders
*/


public class Codility {
    public static void main(String[] args) {


        consecutiveNum(100);
    }


    public static void consecutiveNum(int N) {

        for (int i = 1; i <= N; i++) {
            StringBuffer str1 = new StringBuffer();

            if (i % 2 == 0) {
                str1.append("Codility");
            }
            if (i % 3 == 0) {
                str1.append("Test");
            }
            if (i % 5 == 0) {
                str1.append("Coders");
            }

            if (str1.length() > 0) {
                System.out.println(str1);
            } else {
                System.out.println(i);
            }
        }

    }
}