package Nataliia;

public class Codility {
    /*
Write a function that given a positive integer N prints the consecutive numbers
from 1 to n  each on separate lines. However , any number divisible by 2, 3 or 5  should  be replaced by the word Codility, Test or Coders respectively. If a number is divisible by more than one of the numbers 2,3 or 5,  it should placed by concatenation of respective words Codility, Test and Coders in this given order. For example, 2,3 and 5, should be replaced by CodilityTestCoders.
 */

    public static void main(String[] args) {

        int number = 74;
        String divisibleBy2 = "Codility";
        String divisibleBy3 = "Test";
        String divisibleBy5 = "Coders";

        for (int i = 1; i <=number ; i++) {
            if( i % 2 ==0 && i % 3 == 0 && i % 5 == 0){
                System.out.println(divisibleBy2+divisibleBy3+divisibleBy5);
            }else if(i % 2 ==0 && i % 3 == 0){
                System.out.println(divisibleBy2+divisibleBy3);
            }else if(i % 2 == 0 && i % 5 == 0){
                System.out.println(divisibleBy2+divisibleBy5);
            }else if( i % 3 == 0 & i % 5 == 0){
                System.out.println(divisibleBy3+divisibleBy5);
            }else if(i % 2 == 0 && i % 3 !=0 & i % 5!=0){
                System.out.println(divisibleBy2);
            }else if(i %3 == 0 && i %2 !=0 && i %5 !=0){
                System.out.println(divisibleBy3);
            }else if(i % 5 ==0 && i %2 !=0 & i % 3 !=0){
                System.out.println(divisibleBy5);
            }else{
                System.out.println(i);
            }


        }
    }
}
