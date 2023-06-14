package SimonaTasks.anagram_of_two_Strings;

//Write a return method that checks if a string is built out of the same letters as another string.
//Ex:  same("abc",  "cab"); -> true
//same("abc",  "abb"); -> false

import java.util.Arrays;

public class Anagram_task01 {

    public static void main(String[] args) {

        checkAnagram(" abb", "abb");
    }


    public static void checkAnagram(String str1, String str2) {


        str1 = str1.toLowerCase().trim();
        str2 = str2.toLowerCase().trim();

        //check if the length is same
        if (str1.length() == str2.length()) {

            //convert strings to char array
            char[] charArray1 = str1.toCharArray(); // converts the String to char ['', '', '']
            char[] charArray2 = str2.toCharArray();

            //sort the char array
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            //if the sorted char arrays are the same then the String is anagram

            boolean result = Arrays.equals(charArray1, charArray2);

            if (result) {
                System.out.println(str1 + " and " + str2 + " are anagram");
            } else {
                System.err.println(str1 + " and " + str2 + " are NOT anagram");
            }

        } else {
            System.err.println(str1 + " and " + str2 + " are NOT anagram");

        }

    }




}











