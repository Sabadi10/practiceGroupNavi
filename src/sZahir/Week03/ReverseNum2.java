package sZahir.Week03;

public class ReverseNum2 {
    public static int reverseNegNum(int number) {
        if (number > 0) {
            return number;
        } else {
            String str = String.valueOf(number);
            String reverse = "";
            for (int i = str.length() - 1; i >= 1; i--) {
                reverse += str.charAt(i);
            }
            int reverseNum = Integer.parseInt(reverse);
            return reverseNum * -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(reverseNegNum(-1234));
    }
}
