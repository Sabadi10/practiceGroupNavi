package weeklyQuestionsEmir.Week06;
/*
2) String - sum of digits in a string
This is a method that can return the sum of the digits in a string
e.g.
 */
public class StringDigits {
    public static int sumOfDigits(String str){

        int sum=0;

        for (int i = 0; i < str.length(); i++) {
           char ch=str.charAt(i);
            if(Character.isDigit(ch)){ // used to determine whether a given character is a digit or not.
                int digit = Character.getNumericValue(ch);//  used to retrieve the numeric value of a given character.
                sum += digit;
            }
            }


        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits("99923Abc8936"));
    }
    }


