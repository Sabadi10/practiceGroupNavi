package camilo_tests.week04;

import java.util.Scanner;

public class FindTheUnique {

    /*
        3.String -- Find the unique
        Write a return  method that can find the unique characters from the String
        Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
     */


        public static String uniqueStr() {

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter String: ");

            String str1 = scan.nextLine().toLowerCase();
            scan.close();

            String result = "";

            for (int i = 0; i < str1.length() ; i++) {
                char currentChar= str1.charAt(i);
                if(str1.indexOf(currentChar)==str1.lastIndexOf(currentChar)){
                    result +=(currentChar);
                }
            }
            return result;
        }

        public static void main(String[] args) {
            System.out.println(uniqueStr());
        }
    }