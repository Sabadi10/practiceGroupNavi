package SZahir.Week05;

import java.util.Scanner;

public class Unique_Values {
    /*

This is a return  method that can find the unique characters from the String
Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
input: AAAAABBBBBDDDDD$$$%%^^YYHGGG .......output: h
 */
        public static String unique() {

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a string: ");

            String str = scan.nextLine().toLowerCase();
            scan.close();

            String result = "";

            for (int i = 0; i < str.length() ; i++) {
                char currentChar= str.charAt(i);
                if(str.indexOf(currentChar)==str.lastIndexOf(currentChar)){ // ABBCCF
                    result +=(currentChar);
                }
            }
            return result;
        }

        public static void main(String[] args) {
            System.out.println(unique());
        }
    }


