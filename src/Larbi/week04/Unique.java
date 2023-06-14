package Larbi.week04;

import java.util.Arrays;
import java.util.Scanner;

public class Unique {

    public static void main(String[] args) {
        /*
    3.String -- Find the unique
        Write a return  method that can find the unique characters from the String
        Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
     */

        System.out.println(unique());

    }
    public static String unique(){

        System.out.print("Enter a word: ");
        Scanner input = new Scanner(System.in);
        String str = input.next();

        String uniq = "";

        char[] ch = str.toCharArray();

        for (int i = 0; i < ch.length; i++) {
                int count = 0;
            for (int j = 0; j < ch.length; j++) {
                if(ch[i] == ch[j]){
                    count++;
                }
            }

            if(count==1){
                uniq += "" +ch[i];
            }
        }
        return uniq;
//        for (char each: ch) {
//            int count = 0;
//            for (char element : ch) {
//                if (element == each){// stands for every element in String
//                    count++;
//                }
//            }
//
//            if (count==1){
//                System.out.print(each);
//            }
//        }
    }

}
