package Week3;
/*
Write a method that can check if a number is prime or not.
Prime number - it's whole number, grater than 1, that cannot be exactly divided be any whole numbers other than itself and 1:
it's 2, 3, 5, 7, 11, 13, 17...
*/
public class PrimeNumber {

    public static void main(String[] args) {

            for (int i = 0; i <20; i++) {
                if (isPrime(i)){
                    System.out.println(i+" ");
                }
            }
        }
        public static boolean isPrime(int number){
            if (number < 2){
                return false;
            }
            for (int i = 2; i < number; i++) {
                if (number%i==0){
                    return false;
                }
            }
            return  true;
        }
    }
