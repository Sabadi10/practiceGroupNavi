package Larbi.week03;

import java.util.Scanner;

public class freqOfChar {

    public static void main(String[] args) {


        // String - Frequency of Characters
        // Write a return method that can find the frequency of characters
        // Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

        System.out.println(MM());

    }



    public static String MM(){
        System.out.print("Enter a string to get its Frequency: ");
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            int count = 0;

            for(int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    count++;
                }
            }
            if(result.contains(""+ch)){
                continue;
            }
            result += ch + "" + count;
        }

        return result;
    }
}