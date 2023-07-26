package SimonaTasks.oddEven;

import java.util.Scanner;

public class oddEven_Scanner {

    public static void main(String[] args) {

     while(true) {

         Scanner input = new Scanner(System.in);

         System.out.println("Enter a number: ");
         int number = input.nextInt();

         if (number % 2 == 0) {
             System.out.println(number + " is EVEN number");
         } else {
             System.out.println(number + " is ODD number");
         }

     }



    }
}
