package Wednesday_3;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequencyCounter {

    public static String frequencyOfChars(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Count the frequency of each character in the string
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Build the resulting string with character frequencies
        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            result.append(entry.getKey()).append(entry.getValue());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String str = "AAABBCDD";
        String frequency = frequencyOfChars(str);
        System.out.println("Frequency of characters in \"" + str + "\": " + frequency);
    }
}




/// In this code, the frequencyOfChars method takes a string str as input and returns a string representing the frequency of characters in the input string. It uses a HashMap named charCountMap to store the count of each character.
//
//The method iterates over each character in the input string using a loop. For each character, it checks if it already exists in the charCountMap. If it does, it increments the count by 1 using getOrDefault(c, 0) + 1 to handle both new and existing characters. If the character doesn't exist, it adds it to the map with a count of 1.
//
//After counting the frequency of each character, the method builds the resulting string by iterating over the entries in the charCountMap. It appends each character and its corresponding count to the StringBuilder object named result.
//
//Finally, it returns the resulting string by converting the StringBuilder object to a string using toString().
//
//The main method demonstrates how to use the frequencyOfChars method by finding the frequency of characters in the string "AAABBCDD" and printing the result. You can modify the str variable in the main method to test the frequency count for different strings.
