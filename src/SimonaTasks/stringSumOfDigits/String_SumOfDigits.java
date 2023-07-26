package SimonaTasks.stringSumOfDigits;

/*
   2) String - sum of digits in a string
      Write a method that can return the sum of the digits in a string
 */

public class String_SumOfDigits {

    public static void main(String[] args) {

        String str1 = "222A";

        System.out.println(sumOfDigits(str1));
    }

    public static int sumOfDigits(String str){

        int sum = 0; // storing the sum of digits
        int digits = str.length(); // length of input string 'str'

        for (int i = 0; i < digits; i++){ // loop will iterate over each character in the string

            if (Character.isDigit(str.charAt(i))){ //method() checks if the char at the current position is a digit

                String tempValue = str.substring(i, i+1); // If the character is a digit, it extracts that digit as a substring using the substring(), substring is then stored in the tempValue variable
                sum += Integer.parseInt(tempValue); //tempValue string is then converted to an integer using Integer.parseInt() and added to the sum variable.
            }
        }
        return sum; //final sum of digits is returned as the result.
    }

    /*
    this method calculates the sum of all the digits present in the given string
    and returns the result as an integer
     */

}
