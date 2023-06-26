package Larbi.week6;

public class sumStringDigit {

//    String - sum of digits in a string
//    Write a method that can return the sum of the digits in a string

    public static void main(String[] args) {

        String str = "2222";

        System.out.println(sumOfDigits(str));
    }

    public static int sumOfDigits(String str) {
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                sum += Character.getNumericValue(ch);
            }
        }

        return sum;
    }

}
