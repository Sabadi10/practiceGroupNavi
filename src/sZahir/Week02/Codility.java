package sZahir.Week02;

/*
Write a function that given a positive integer N prints the consecutive numbers
from 1 to n  each on separate lines
- if the numbers is divisible by more than one of the numbers 2,3,5 etc
it should print Codility, Test, Coders

 */
public class Codility {
    public static void ConsecutiveNumber(int num) {

        for (int i = 1; i <= num; i++) {
             StringBuilder output = new StringBuilder();



            if (i % 2 == 0) {
                output.append("Codility"); // output stores the values

            }
            if (i % 3 == 0) {
                 output.append("Test");

            }
            if (i % 5 == 0) {
                output.append("Coders");

            }

        if (output.length() > 0) {
            System.out.println(output);
        } else {
            System.out.println(i);
        }
    }


        }



    public static void main(String[] args) {

ConsecutiveNumber(30);


        }

    }

