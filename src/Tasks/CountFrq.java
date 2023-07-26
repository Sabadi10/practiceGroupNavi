package Tasks;

import java.util.Scanner;

public class CountFrq {
    // Create a method to calculate  frequency of character in a String
    // I create a method with for loop o to Iterate each character in a string and save it int new string with a frequency of it in the first string
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the text");

        String Text = input.next();

        System.out.println( frqChar(Text));

    }
    public static String frqChar(String str){
        String reverseStr = "";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            count = 0;

            char ch1 = str.charAt(i);

            for (int j = 0; j < str.length(); j++) {

                if (ch1 == str.charAt(j)){
                    count++;
                }

            }
            if (!(reverseStr.contains(ch1 +""))){
                reverseStr += count + "" + ch1;
            }

        }
        return  reverseStr;


    }
}
