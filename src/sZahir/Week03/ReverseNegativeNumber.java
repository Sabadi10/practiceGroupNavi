package sZahir.Week03;

//This is a return method that can reverse negative number and return it as int
/*
-if number is positive it will return positive number
-if number is negative then it reversed the number e.g.
input: -987 ........output : -789
input: -120 ........output : -021
input: 456 .........output : 456
 */
public class ReverseNegativeNumber {
    public static String reverseNegativeNumber(int number) {


        boolean isNegative = number < 0;
        if (isNegative) {
            number = -number; // converts it to positive to reverse
        }


        String reversedString = new StringBuilder(String.valueOf(number)).reverse().toString();

        return isNegative? "-" + reversedString: String.valueOf(number); // valueOf() ...as static method
        // that converts the specified value to an object of the corresponding type. in this case
        // the integer number is converted to a string
    }


    public static void main(String[] args) {
      // String reversed=reverseNegativeNumber(-200);

        System.out.println(reverseNegativeNumber(-200));
    }
}
