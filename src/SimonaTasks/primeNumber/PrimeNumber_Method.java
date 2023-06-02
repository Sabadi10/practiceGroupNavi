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

        primeNumber(17);


    }

    public static void primeNumber(int num){

        for (int i = 2; i < num; i++){

        }

        if (num % 2 == 0 && num < 1){
            System.out.println(num + " is not a prime number");
        }else {
            System.out.println(num + " is a prime number");
        }




    }



}
