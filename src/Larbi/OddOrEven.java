package Larbi;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        if(num % 2 == 0){
            System.out.println(num +" is an Even number.");
        }else{
            System.out.println(num + " is an Odd number.");
        }

            /*
            Write  a method which can identify given number is even or odd
        Output ex:
        identify(5); ->"Odd"
        identify(6); ->"Even"
             */

    }
}