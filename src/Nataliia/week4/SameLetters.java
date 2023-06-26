package Nataliia.week4;

import java.util.Arrays;

public class SameLetters {

    public static void main(String[] args) {
        /*
        String ---same letters
        Write a return method that checks if a string is build out of the same letters as a another string.
        Ex: same ("abc", "cab");---> true
            same ("abc", "abb");---> false
         */

        System.out.println(sameLetters("a@bcd12", "cda2b1@"));
    }

    public static boolean sameLetters(String str, String str2) {

        //remove all white spaces and convert to lower case
        str = str.toLowerCase().replaceAll(" ", "");
        str2 = str2.toLowerCase().replaceAll(" ", "");
        //check if length of both strings are matching
        if (str.length() != str2.length()) {
            return false;
        }
        //covert string to char Array
        char[] ArrayStr = str.toCharArray();
        char[] ArrayStr2 = str2.toCharArray();
        //sort in ascending order
        Arrays.sort(ArrayStr);
        Arrays.sort(ArrayStr2);
        return Arrays.equals(ArrayStr,ArrayStr2);
    }

}
