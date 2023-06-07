package SimonaTasks.frequencyOfCharacters;

/*
 3) String - Frequency of Characters
Write a return method that can find the frequency of characters
Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */



public class Frequency_of_Characters {

    public static void main(String[] args) {

        System.out.println(frequencyOfCharacters("AABBCCC"));

    }

    public static String frequencyOfCharacters(String givenWord) {


        String result = "";

        for (int i = 0; i < givenWord.length(); i++) {
            char current = givenWord.charAt(i);
            int frequency = 0;

            for (int j = 0; j < givenWord.length(); j++) {
                if (givenWord.charAt(i) == givenWord.charAt(j)) {
                    frequency++;
                }
            }

            if (!result.contains(current + "")) {
                result += (current + "" + frequency);
            }
        }
     return result;

    }


}
