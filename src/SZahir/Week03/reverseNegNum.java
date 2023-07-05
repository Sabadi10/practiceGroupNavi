package SZahir.Week03;
///This is a return method that can reverse negative number and return it as int
/*
-if number is positive it will return positive number
-if number is negative then it reversed the number e.g.
input: -987 ........output : -789
input: 456 .........output : 456
 */
public class reverseNegNum {

    public static int reverseNegNumbers(int num){
        if(num >=0){
            return num;
        }
        int result=0;
        while(num <0) {
            result = result * 10 + num % 10; // take the # multiply by 10 then add remainder
            num = num / 10;
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println(reverseNegNumbers(-789));
    }
}
