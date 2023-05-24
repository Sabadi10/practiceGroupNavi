import java.util.Scanner;
public class week1NumbersOddOrEven {
       public static void main(String[] args) {

              Scanner input = new Scanner(System.in);
              System.out.print("Enter a number: ");
              int number = input.nextInt();

              if (number % 2 == 0) {
                     System.out.println(number + " is Even number");
              } else {
                     System.out.println(number + " is Odd number");
              }
       }
}
/*
Write  a method which can identify given number is even or odd
Output ex:  identify(5); ->"Odd"
            identify(6); ->"Even"
 */