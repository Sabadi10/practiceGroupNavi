package SimonaTasks.week3;

public class reversePositiveNumber {

    public static void main(String[] args) {

        System.out.println(reversePositiveNum(100));

    }

    public static String reversePositiveNum(int number) {
        String input = String.valueOf(number);
        String result = "";


            for (int i = input.length() - 1; i >= 1; i--) {
                result = result + input.charAt(i);
            }

            return "-" + result;
        }


    }

