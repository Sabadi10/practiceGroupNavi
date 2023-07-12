package emirQuestions2;

/*
Write a function that, given a positive integer N, prints the consecutive numbers from 1 to N,
each on a separate line. However, any number divisible by 2, 3 or 5 should be replaced by the word "Codility", "Test" or "Coders" respectively.
If a number is divisible by more than one of the numbers: 2, 3 or 5, it should be replaced by a concatenation of the respective words "Codility", "Test" or "Coders" in this given order.
For ex: numbers divisible by both 2 and 3 should be replacee by CodilityTest and numbers divisible by all three should be replaced:
"CodilityTestCoders".
 */

public class PrintConsecutiveNumbers {

        public static void main(String[] args) {

            Num(35);
        }

        public static void Num(int N) {

            for (int i = 1; i <= N; i++) {
                StringBuffer str = new StringBuffer();

                if (i % 2 == 0) {
                    str.append("Codility");
                }
                if (i % 3 == 0) {
                    str.append("Test");
                }
                if (i % 5 == 0) {
                    str.append("Coders");
                }

                if (str.length() > 0) {
                    System.out.println(str);
                } else {
                    System.out.println(i);
                }

            }

        }

    }