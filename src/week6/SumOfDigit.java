package week6;

public class SumOfDigit {

    public static int sumOfDigits(String str){

        int sum=0;

        for (int i = 0; i < str.length(); i++) {

            char chr=str.charAt(i);

            if(Character.isDigit(chr)){
                int digit = Character.getNumericValue(chr);
                //This method returns the numeric value of the character,
                sum += digit;
            }
        }


        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits("1254SFGAS250"));
    }
}



