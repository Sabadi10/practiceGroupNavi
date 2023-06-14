package emirQuestions4;

/*
Write a return method that can remove the duplicated values from String
Ex:  removeDup("AAABBBCCC")  ==> ABC

 */

import java.util.Scanner;

public class String_RemoveDuplicates {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        String word= scan.nextLine();



        String result="";

        for (int i = 0; i < word.length(); i++) {


            char letter=word.charAt(i);

            if (!result.contains(""+letter)){
                result+=letter;
            }

        }
        System.out.println(result);
    }

}
