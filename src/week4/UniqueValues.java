package week4;

import java.util.Scanner;

public class UniqueValues {
    public static void main(String[] args) {


        Scanner kb = new Scanner(System.in);
        String word = "";

        System.out.println("Enter a word: ");
        word = kb.nextLine();

        uniqueCharacters(word);
    }


    public static void uniqueCharacters(String test){
        String temp = "";
        for (int i = 0; i < test.length(); i++){
            if (temp.indexOf(test.charAt(i)) == - 1){
                // searches this string and returns the index of the first occurrence of the specified substring.
                temp = temp + test.charAt(i);
            }
        }

        System.out.println(temp + " ");

    }
}




/*
3.String -- Find the unique
Write a return  method that can find the unique characters from the String
Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
input: AAAAABBBBBDDDDD$$$%%^^YYHGGG .......output: h
 */


