package SimonaTasks.oddEven;

public class odEven_method {

    public static void main(String[] args) {

        int num1 = 10;
        odOrEven(num1);

        int num2 = 7;
        odOrEven(num2);

    }


    // the method takes an argument num, and verifies if the number is odd num or even
    public static void odOrEven (int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even number");
        } else {
            System.out.println(number + " is odd number");
        }


    }
}
/*
Numbers -  Odd or even:
Write  a method which can identify given number is even or odd
Output ex:
identify(5); ->"Odd"
identify(6); ->"Even
 */