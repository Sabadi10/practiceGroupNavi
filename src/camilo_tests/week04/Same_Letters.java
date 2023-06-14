package camilo_tests.week04;

import java.util.Arrays;

public class Same_Letters {

    /* Write a return method that checks if a string is built out of the same letters as another string.
    //     Ex:  same("abc",  "cab"); -> true
            same("abc",  "abb"); -> false
     */

    public static void main(String[] args) {

        String str1="abcdef";
            String str2="abdf";

        char[] ch1=str1.toCharArray();
            char[] ch2=str2.toCharArray();

        Arrays.sort(ch1);
            Arrays.sort(ch2);

        boolean hasSameLetters=Arrays.equals(ch1,ch2);
        System.out.println("The provided String has the same letters: " + hasSameLetters);
    }
}


