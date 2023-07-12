package emirQuestions4;

/*
Write a return method that checks if a string is built out of the same letters as another string.
Ex:  same("abc",  "cab"); -> true
same("abc",  "abb"); -> false
 */

import java.util.Arrays;

public class String_SameLetters {

    public static void main(String[] args) {

        System.out.println(SameLetter("cinema","iceman"));




    }


    public static boolean SameLetter(String str, String str1){

        char[]  ch1=str.toCharArray();
        char[]  ch2=str1.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);


        boolean sameLetter =Arrays.equals(ch1,ch2);

        return sameLetter;

    }


}
