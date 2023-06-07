package Utility;

public class reverseNegNumber {


    public static int reverseNegNum(int number) {

        String reverse = "";
        if (number > 0) {
            return number;
        } else {
            //String str = Integer.toString(number);
            String str = String.valueOf(number);

            for (int i = str.length() - 1; i >= 1; i--)
                reverse += str.charAt(i);

        }
         int reverseNum = Integer.parseInt(reverse);
        return reverseNum * -1;
    }



    public static void main(String[] args) {
        System.out.println(reverseNegNum(-346725));
    }

    }


