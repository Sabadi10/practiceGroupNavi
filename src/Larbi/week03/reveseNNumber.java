package Larbi.week03;

import java.util.Scanner;

public class reveseNNumber {
    public static void main(String[] args) {

        // Number - Reverse negative number
        // Write a return method that can reverse negative number and return it as int


        System.out.println(revNNumber());
        // System.out.println(revNegNumber());


    }

    public static int revNNumber() {

        System.out.print("Enter a negative number: ");
        Scanner scan = new Scanner(System.in);
        int nNumber = scan.nextInt();

        int lastResult = 0;

        if (nNumber <= 0) {

            String result = "";

            String str = Integer.toString(nNumber);// "-245"

            char[] ch = str.toCharArray(); // {-, 2, 4, 5}

            for (int i = ch.length - 1; i >= 1; i--) {
                result += ch[i]; // result = "542"
            }

            String z = ch[0] + result; // this line to add "-" to the result which is "542" so after that line it will be "-542"

            lastResult = Integer.valueOf(z); // to switch the string to an int

        } else {
            System.out.println("This is not a negative number!");
            System.exit(1);
        }

        return lastResult;
    }

//    public static int revNegNumber(){
//
//        System.out.print("Enter a negative number to reverse it: ");
//        Scanner input = new Scanner(System.in);
//        int num = input.nextInt();
//
//        if (num >= 0 ) {
//            //int num1 = num+" is not a negative number";
//            System.out.println(num + " is not a negative number!");
//            System.exit(1);
//        }else{
//            num *= -1;
//        }
//
//        return num;
//
//    }

}
