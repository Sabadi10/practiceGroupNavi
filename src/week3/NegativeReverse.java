package week3;

public class NegativeReverse {
    public static int reverseNegNumbers(int num){

        int result=0;
        while(num !=0) {
            result = result * 10 + num % 10;
            num = num / 10;
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println(reverseNegNumbers(-789));
        System.out.println(reverseNegNumbers(-456));
    }
}





///Write a return method that can reverse negative number and return it as int
/*
-if number is positive it will return positive number
-if number is negative then it reversed the number e.g.
input: -987 ........output : -789
input: 456 .........output : 654
 */


