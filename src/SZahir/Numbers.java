package SZahir;

public class Numbers {
    public static void main(String[] args) {

        System.out.print("Divisible By 15: ");

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0 && i % 15 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.print("Divisible By 3: ");

        for (int j = 1; j <= 100; j++) {
            if (j % 3 == 0 && j % 15 != 0) {
                System.out.print(j + " ");
            }
        }

        System.out.println();

        System.out.print("Divisible By 5: ");

        for (int num = 1; num <= 100; num++) {
            if (num % 5 == 0 && num % 15 != 0) {
                System.out.print(num + " ");
            }
        }
    }
}





 /*
 write a program that can print numbers between 1-100 that can be divisible by 3,5,15
 - if the number can be divisible by 3,5, 15, it should only be displayed in the  DivisibleBy15 section
 - if the number can be divisible by 3 and not 15 it should only be displayed in the DivisibleBy3 section
 -divisible by 5 but not 15 it should only be displayed in the DivisibleBy5 section
  */