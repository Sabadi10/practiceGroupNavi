package anna.week04;
/*
Write a return method that checks if a string is built out of the same letters as another string.
Ex:  same("abc",  "cab"); -> true
same("abc",  "abb"); -> false
 */
import java.util.Arrays;

public class SameLetter {
    public static boolean sameLetters (String str1, String str2){
        str1=str1.toLowerCase();
        str2=str2.toLowerCase(); // convert to lower case

        //remove white spaces
        str1 = str1.replaceAll("\\s", "");
        str2 = str2.replaceAll("\\s", "");

        // Check if the lengths of the strings are the same

        if(str1.length() != str2.length()){
            return false;
        }

        // Convert the strings to character arrays
        char[] charArray1= str1.toCharArray();
        char[] charArray2= str2.toCharArray();


        // Compare the sorted character arrays
        return Arrays.equals(charArray1,charArray2);

    }
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
