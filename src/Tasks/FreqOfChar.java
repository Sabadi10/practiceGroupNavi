package Tasks;

import java.util.HashMap;

public class FreqOfChar {
    //   Map - Frequency of Characters
    //Write a method that prints the frequency of each character from a String

    public static void printCharacterFrequency(String inputString) {
        // Create a HashMap to store the character frequencies
        HashMap<Character, Integer> charFrequencyMap = new HashMap<>();

        // Convert the inputString to a char array to iterate through each character
        char[] chars = inputString.toCharArray();

        // Iterate through each character in the char array
        for (char ch : chars) {
            // Increment the frequency of the character in the HashMap
            charFrequencyMap.put(ch, charFrequencyMap.getOrDefault(ch, 0) + 1);
        }

        // Print the character frequencies
        for (char ch : charFrequencyMap.keySet()) {
            int frequency = charFrequencyMap.get(ch);
            System.out.println("Character: " + ch + " Frequency: " + frequency);
        }
    }

    public static void main(String[] args) {
        String inputString = "Hello, Navi Group!";
        printCharacterFrequency(inputString);
    }
}
