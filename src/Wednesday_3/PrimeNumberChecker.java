package Wednesday_3;



    public class PrimeNumberChecker {

        public static boolean isPrime(int number) {
            if (number <= 1) {
                return false;
            }

            // Check if the number is divisible by any number from 2 to its square root
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false; // Found a divisor, not a prime number
                }
            }

            return true; // No divisors found, prime number
        }

        public static void main(String[] args) {
            int number = 17;
            if (isPrime(number)) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        }
    }




// In this code, the isPrime method takes an integer number as input and returns true if the number is prime and false otherwise. It first checks if the number is less than or equal to 1, in which case it immediately returns false since prime numbers are greater than 1.
//
//Next, it uses a loop to check if the number is divisible by any number from 2 to the square root of the number. If a divisor is found, it means the number is not prime, and the method returns false. If no divisors are found, the method returns true, indicating that the number is prime.
//
//The main method demonstrates how to use the isPrime method by checking if a given number (in this case, 17) is prime and printing the result accordingly. You can modify the number variable in the main method to test the prime number check for different numbers.