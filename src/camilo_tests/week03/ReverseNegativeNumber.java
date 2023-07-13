package camilo_tests.week03;

        /* This is a return method that can reverse negative number and return it as int
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
            number =-number;
        }

        String reversedString = new StringBuilder(String.valueOf(number)).reverse().toString();

        return isNegative? "-" + reversedString: String.valueOf(number);
    }

    public static void main(String[] args) {
        System.out.println(reverseNegativeNumber(-987));
    }
}