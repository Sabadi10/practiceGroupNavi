package week2;

import java.util.Scanner;

public class SwabNumbers {
    public static void main(String[] args) {


        int x = 15;
        int y = 26;

        System.out.println("Before swapping numbers:");
        System.out.println("x : " + x);
        System.out.println("y : " + y);
        System.out.println("---------------------------------------");


        x = x + y;

        System.out.println(x);  // x=41

        y= x-y;

        System.out.println(y);   // y=15
        System.out.println("---------------------------------------");

        x= x-y;

        System.out.println("After swapping numbers:");
        System.out.println("x : " + x);
        System.out.println("y : " + y);

        System.out.println("---------------------------------------");

        System.out.println("SECOND WAY");

        System.out.println("Enter the value of a");

        Scanner scan= new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println("Enter the value of b");




        int b = scan.nextInt();

        System.out.println("before swapping numbers: a : "+ a +" b : "+ b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping: a : "+ a +"  b : " + b);


    }
}
/*
 swap two numbers without using the third variable
 */

