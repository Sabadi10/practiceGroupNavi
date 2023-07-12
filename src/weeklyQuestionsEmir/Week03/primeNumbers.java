package weeklyQuestionsEmir.Week03;



/* This method can check if a number is prime or not
prime numbers are numbers that can only be divided by 1 and itself
e.g. 2, 7, 13 etc
 */
public class primeNumbers {
    public static void isPrime(int number) {

        if (number < 2) {
            System.out.println(number + " is not a prime number");

            return; // to capture negative number
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println(number + " is not a prime number");
                return;
            }
        }
                System.out.println(number + " is a prime number");
            }



    public static void main(String[] args) {
      isPrime(-99);
    }
    }

