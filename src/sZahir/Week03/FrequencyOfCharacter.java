package sZahir.Week03;
/*
This is a return method that can find the frequency of characters
Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

logic:
result = number
use length ....str.length
 */
public class FrequencyOfCharacter {
    public static String characterFrequency(String str){
        StringBuilder result=new StringBuilder();

        int count=1;
        for (int i = 1; i < str.length() ; i++) {
            if(i + 1 < str.length() && str.charAt(i)== str.charAt(i+1)){
                count ++;
            } else {
                result.append(str.charAt(i)).append(count);
                count=1;
            }

        }
        return result.toString();
    }

    public static void main(String[] args) {
        String input="AAABBBCDD";
        String frequency= characterFrequency(input);
        System.out.println("Character Frequencies: " + frequency);
    }
}