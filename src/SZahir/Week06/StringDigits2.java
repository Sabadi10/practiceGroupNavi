package SZahir.Week06;

public class StringDigits2 {
    public static int digitSum(String digit) {

        int sum = 0;
        for (int i = 0; i < digit.length(); i++) {
            int ch = digit.charAt(i) - '0';//If the character is a digit,
            // it converts it to an integer by subtracting '0' from it
            // (ch - '0') and adds it to the sum variable.
            if (digit.charAt(i) >= '0' && digit.charAt(i) <= '9') {
                sum += ch;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(digitSum("99923Abc8936")); // does not work
    }
}
