package SimonaTasks.primeNumber;

// task:   1) Numbers - Prime Number
//Write a method that can check if a number is prime or not
// Prime number is a whole number greater than 1 that cannot be exactly divided by any whole number other than itself and 1 (e.g. 2, 3, 5, 7, 11).

/* LOGIC:
   - The only even prime number is 2
   - Zero and 1 are not considered prime numbers
   - check to see if the number is greater than 2
   - -if remainder >1 = composite
 */

public class PrimeNumber_Method {

    public static void main(String[] args) {

        System.out.println(isPrimeNumber(2));


    }

    public static boolean isPrimeNumber(int num) {

        if(num < 2){
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
       return true;

    }


    }





