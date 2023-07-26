package camilo_tests.week04;

import java.sql.SQLOutput;
import java.util.Scanner;

public class RemoveDuplicates {

    /*
        2. String -- Remove Duplicates
        Write a return method that can remove the duplicated values from String
        Ex:  removeDup("AAABBBCCC")  ==> ABC
     */

    public static void main(String[] args) {

            removeDup ("AAABBBCCC");
        }


        public static void removeDup(String str){
            String result = "";

            for (int i = 0; i < str.length(); i++){

                char each = str.charAt(i); // each char of String str

                if (!result.contains("" + each)){
                    result += each;
                }
            }

            System.out.println(result);

        }

    }