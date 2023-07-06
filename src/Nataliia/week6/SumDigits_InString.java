package Nataliia.week6;
/*
   String - sum of digits in a string
   Write a method that can return the sum of the digits in a string
 */
public class SumDigits_InString {

    public static int sumOfDigits_inString(String str){

        int sum = 0;
        int digits = str.length();

        for (int i = 0; i < digits; i++){

            if (Character.isDigit(str.charAt(i))){ //method() checks if the char at the current position is a digit

                String tempValue = str.substring(i, i+1); // If the character is a digit, it extracts that digit as a substring using the substring(), substring is then stored in the tempValue variable
                sum += Integer.parseInt(tempValue); //tempValue string is then converted to an integer using Integer.parseInt() and added to the sum variable.
            }
        }
        return sum; //final sum of digits is returned as the result.
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits_inString("2244AqD"));
    }
}
