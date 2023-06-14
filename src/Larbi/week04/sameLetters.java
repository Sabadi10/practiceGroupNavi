package Larbi.week04;

import java.util.Arrays;
import java.util.Scanner;

public class sameLetters {

    public static void main(String[] args) {
        /*
        1.String -- Same letters

            Write a return method that checks if a string is built out of the same letters as another string.
            Ex:  same("abc",  "cab"); -> true
            same("abc",  "abb"); -> false
         */

        System.out.println(sameLet());

    }

    public static boolean sameLet() {

        System.out.print("Enter the first word: ");
        Scanner input = new Scanner(System.in);
        String firstWord = input.next();

        System.out.print("Enter the first word: ");
        String secondWord = input.next();


        char[] a = firstWord.toCharArray();
        char[] b = secondWord.toCharArray();


        Arrays.sort(a);
        Arrays.sort(b);

        if (Arrays.equals(a, b)) {
            return true;
        }

        return false;
    }
}
