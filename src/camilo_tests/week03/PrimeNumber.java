package camilo_tests.week03;

/*
                 1) Numbers - Prime Number**
                 prime number is a number that can be divisible by 1 and the number itself
                 write a method that can check if a number is prime or not

 */



public class PrimeNumber {


    public static void main(String[] args) {

        primeNumber(5);


    }

    public static void primeNumber (int num){

        if(num < 2){
            System.out.println(num + " is not a prime number.");

            for (int i = 0; i < num; i++) {
                if(num % i ==0 ){
                    System.out.println(num + " is not a prime number.");

                }else{
                    System.out.println(num + " is a prime number.");
                }


            }
        }

    }
}