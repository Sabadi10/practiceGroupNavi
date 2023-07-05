package Larbi.week6;

public class sumStringDigit {

//    String - sum of digits in a string
//    Write a method that can return the sum of the digits in a string

    public static void main(String[] args) {

        String str = "2541";
        System.out.println(sumOfDigits(str));
    }

    public static int sumOfDigits(String str) {
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);


            if (Character.isDigit(ch)) {

                sum += Character.getNumericValue(ch);
                // The getNumericValue() method of character class returns the int value of the specified character.
                // If the character does not have any int value, -1 is returned.
                // If the character has a numeric value that cannot be represented as a non-negative integer, -2 is returned.
            }
        }

        return sum;
    }

}
