package week6;
/*
Write a method that can return the sum of the digits in a string
 */
public class SumOfDigits {

    public static int sumOfDigits(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i)))
                sum = sum + Character.getNumericValue(s.charAt(i));
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumOfDigits("Sum of all the digit present in String : " + "h1f2g3d4h5f6d7h8"));
    }
}
