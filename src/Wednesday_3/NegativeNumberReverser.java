package Wednesday_3;

public class NegativeNumberReverser {

    public static int reverseNegativeNumber(int number) {
        if (number >= 0) {
            return number; // Return the number as is if it is non-negative
        }

        String numberStr = Integer.toString(number); // Convert the number to a string
        StringBuilder reversedStr = new StringBuilder(numberStr.substring(1)); // Remove the negative sign

        return Integer.parseInt(reversedStr.reverse().insert(0, "-").toString()); // Reverse and convert back to int
    }

    public static void main(String[] args) {
        int number = -12345;
        int reversedNumber = reverseNegativeNumber(number);
        System.out.println("Original number: " + number);
        System.out.println("Reversed number: " + reversedNumber);
    }
}


// In this code, the reverseNegativeNumber method takes an integer number as input and returns the reversed negative number as an int. If the input number is non-negative, it simply returns the number as is.
//
//If the input number is negative, it converts the number to a string using Integer.toString(). Then, it creates a StringBuilder object and initializes it with the substring of the number string, excluding the negative sign (character at index 0).
//
//Next, it reverses the StringBuilder object using the reverse method and inserts the negative sign at the beginning using insert(0, "-"). Finally, it converts the reversed string back to an int using Integer.parseInt() and returns the result.
//
//The main method demonstrates how to use the reverseNegativeNumber method by reversing a negative number (-12345 in this case) and printing both the original and reversed numbers. You can modify the number variable in the main method to test the reversal for different negative numbers.
