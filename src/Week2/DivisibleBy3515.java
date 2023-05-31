package Week2;
/*
Write a program that prints the numbers from 1 to 100 that are divisible by 3, 5, and 15.
    if a number can be divisible by 3, 5 and 15 then it should only show up in the DivisibelBy15' section
    if the number can be divisible by 3 but cannot be divisible by 15 then it should only show up in the DivisibelBy3' section
    if the number can be divisible by 5 but cannot be divisible by 15, then it should only appear in the DivisibelBy5' section
 ex: Output:    Divisible by 15     15 30 45 60 75 90
                Divisible by 5      5 10 20 25 35 40 50 55 65 70 80 85 95 100
                Divisible by 3      3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99
  */

public class DivisibleBy3515 {
    public static void main(String[] args) {

        System.out.print("Divisible By 15 - ");
        for (int i = 1; i <= 100 ; i++) {
            if(i%3 == 0 && i%5 == 0 && i%15 == 0){
                System.out.print(i + " ");              // Divisible By 3,5,15 - 15 30 45 60 75 90
            }
        }

        System.out.print("\n" +"Divisible By 3 - ");
        for (int i = 1; i <= 100 ; i++) {
            if(i%3 == 0 && i%15 != 0){
                System.out.print(i + " ");              // Divisible By 3 - 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99
            }
        }

        System.out.print("\n"+"Divisible By 5 - ");
        for (int i = 1; i <= 100 ; i++) {
            if(i%5 == 0 && i%15 != 0){
                System.out.print(i + " ");              // Divisible By 5 - 5 10 20 25 35 40 50 55 65 70 80 85 95 100
            }
        }
    }
}
