package SimonaTasks.divisible_by_3_5_15;

/*
Write a program that can print the numbers between 1-100 that can be divisible by 3, 5 and 15
IF the num can be divisible by 3, 5, 15, then it should only be displayed in DivisibleBy15' section
IF the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibleBy3' section
IF the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibleBy5' section

 */


public class DivisibleBy_3_5_15 {

    public static void main(String[] args) {

        String divisibleBy15 = "";
        String divisibleBy5 = "";
        String divisibleBy3 = "";

        for (int i = 1; i <= 100; i++) {

            if (i % 5 == 0 && i % 3 == 0 && i % 15 == 0) {
                divisibleBy15 += (" " + i);
            } else if (i % 15 != 0 && i % 3 != 0 && i % 5 == 0) {
                divisibleBy5 += (" " + i);
            } else if (i % 15 != 0 && i % 5 != 0 && i % 3 == 0) {
                divisibleBy3 += (" " + i);
            } else {
                continue;
            }

        }
        System.out.println("Is divisible by 15: " + divisibleBy15);
        System.out.println("Is divisible by 3: " + divisibleBy3);
        System.out.println("Is divisible by 5: " + divisibleBy5);



    }
}
