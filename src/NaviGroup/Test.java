package NaviGroup;

public class scanner {

    public class scanner {
    package Quizz;

import java.util.Scanner;

        public class NDivide_withoutDivided_Opertaor {
            public static void main(String[] args) {

                Scanner input = new Scanner(System.in);

                System.out.println(" enter the number 1 ");
                int number2 = input.nextInt();

                System.out.println(" enter the number 2");

                int number3 = input.nextInt();
                int num1 = number2;
                int count = 0;
                int result = 0;
                while (number2 >= number3) {
                    result = number2 - number3;
                    number2 = result;
                    count++;
                }
                System.out.println(num1 + " / " + number3 + " = " + count);
            }
        }
    }
}
