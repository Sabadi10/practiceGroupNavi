package weeklyQuestionsEmir.Week04;

import java.util.Scanner;

/*
This is a return method that can remove the duplicated values from String
E.g:  removeDup("AAABBBCCC")  ==> ABC
input =445000gGhhHttTT ....... output: 450ght

 */
public class DuplicateValues {

    public static String removeDuplicates() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");

       String word = scan.nextLine().toLowerCase();
       scan.close();

        String result =""; //value of -1

        for (int i = 0; i < word.length(); i++) {

            char input = word.charAt(i);
            if (result.indexOf(input) ==-1) { // If the index is -1, it means the character is not found in the result string,
                // indicating that it is unique.
                result += input;

            }

        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates());
    }
}




