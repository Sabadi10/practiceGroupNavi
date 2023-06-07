package SimonaTasks.reverseNeativeNumber;

/*
 2) Number - Reverse negative number
Write a return method that can reverse negative number and return it as int
 */

public class ReverseNegativeNumber {

    public static void main(String[] args) {


        System.out.println(reverseNegativeNum(-123));


    }


    public static int reverseNegativeNum(int number) {

        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return reversedNumber;

        /*
        In this code, the reverseNumber method takes an input number and reverses it
        using a while loop. Inside the loop, the last digit of the number is extracted
        using the modulo operator %, and it is added to the reversedNumber
        by multiplying it by 10 and adding the digit. Then, the number is divided by 10 to remove the last digit.
        This process continues until the number becomes 0. Finally, the reversed number is returned.
         */






}










}
