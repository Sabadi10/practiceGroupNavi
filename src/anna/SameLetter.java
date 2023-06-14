package anna;
/*
Write a return method that checks if a string is built out of the same letters as another string.
Ex:  same("abc",  "cab"); -> true
same("abc",  "abb"); -> false
 */
import java.util.Arrays;

public class SameLetter {
    public static void main(String[] args) {

        String str="abc";
        String str1="abd";

        char[]  ch1=str.toCharArray();
        char[]  ch2=str1.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean isSameLetters=Arrays.equals(ch1,ch2);
        System.out.println(isSameLetters);
    }
}
