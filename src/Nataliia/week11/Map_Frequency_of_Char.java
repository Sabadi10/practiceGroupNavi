package Nataliia.week11;

import java.util.HashMap;
import java.util.Map;

/*Map - Frequency of Characters
        Write a method that prints the frequency of each character from a String

 */
public class Map_Frequency_of_Char {

        public static void map_frequency_of_character(String word) {
            // Create a map to store character frequencies
            Map<Character, Integer> frequencyMap = new HashMap<>();

            // Iterate through the string and update the map
            for (char ch : word.toCharArray()) {
                frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
            }

            // Print the character frequencies
            for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
                System.out.println("Character: " + entry.getKey() + " | Frequency: " + entry.getValue());
            }
        }

        public static void main(String[] args) {
            String str = "Hello, world!";
            map_frequency_of_character(str);
        }


}
