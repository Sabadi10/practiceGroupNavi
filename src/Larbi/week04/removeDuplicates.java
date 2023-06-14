package Larbi.week04;

import java.util.Arrays;
import java.util.Scanner;

public class removeDuplicates {
    public static void main(String[] args) {
        /*
            2.String -- Remove Duplicates

            Write a return method that can remove the duplicated values from String
            Ex:  removeDup("AAABBBCCC")  ==> ABC
         */

        System.out.println(duplicateCharacters());

    }

    public static String duplicateCharacters(){
        System.out.print("Enter a word: ");
        Scanner scan = new Scanner(System.in);
        String input = scan.next();

        String remDup = "";


        for (int i = 0; i < input.length(); i++) {

            char a = input.charAt(i);
            if(!remDup.contains(""+a)){
                remDup += a;
            }
        }
        return remDup;
    }
}
