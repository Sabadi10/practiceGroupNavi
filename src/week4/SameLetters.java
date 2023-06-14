package week4;

import java.util.Arrays;
import java.util.Scanner;

public class SameLetters {
    public static void main(String[] args) {

        // create an object of Scanner class
        Scanner input = new Scanner(System.in);

        // take input from users
        System.out.print("Enter first String: ");
        String str1 = input.nextLine().toLowerCase();
        System.out.print("Enter second String: ");
        String str2 = input.nextLine().toLowerCase();

        // check if length is same
        if(str1.length() == str2.length()) {

            // convert strings to char array
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();

            // sort the char array
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            // if sorted char arrays are same
            // then the string is anagram
            boolean result = Arrays.equals(charArray1, charArray2);

            if(result) {
                System.out.println(str1 + " and " + str2 + " same letters, true.");
            }
            else {
                System.out.println(str1 + " and " + str2 + " not same letters, false.");
            }
        }

        input.close();
    }
}
/*
1. Write a return method that checks if a string is built out
of the same letters as another string.
Ex:  same("abc",  "cab"); -> true
same("abc",  "abb"); -> false
 */

