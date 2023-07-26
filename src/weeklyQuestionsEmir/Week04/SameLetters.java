package weeklyQuestionsEmir.Week04;

import java.util.Arrays;

/*
1. This is a return method that checks if a string is built out
of the same letters as another string. // Anagram
Ex:  same("abc",  "cAb "); -> true
same("abc",  "abb"); -> false
 */
public class SameLetters {

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

        // Sort the character arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare the sorted character arrays
        return Arrays.equals(charArray1,charArray2);



    }
    public static void main(String[] args) {
        System.out.println(sameLetters("A BC D", "CABD"));
    }

    }


