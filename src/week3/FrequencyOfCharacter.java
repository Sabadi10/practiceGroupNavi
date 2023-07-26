package week3;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        System.out.println(FrequencyOfChars("AAABBCDD"));

    }
    public static String FrequencyOfChars(String str) {
        String result = "";

        for(int i=0; i < str.length(); i++)

            if(!result.contains(""+str.charAt(i)))
                result+= ""+str.charAt(i);
        String expectedResult = "";

        for( int j=0;j < result.length(); j++)
        {int count = 0;for(int i=0; i < str.length(); i++)
        {
            if(str.charAt(i) == result.charAt(j))count++;}expectedResult +=result.charAt(j)+"" + count;}
        return expectedResult;}
}


/*
String - Frequency of Characters
Write a return method that can find the frequency of characters
Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */

