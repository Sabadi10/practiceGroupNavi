package Week101;
//Write a method that prints the frequency of each character from a String

import java.util.LinkedHashMap;
import java.util.Map;

public class MapFrequencyOfCharacters {
    public static void main(String[] args) {
        frequencyOfCharacter("I love Java");
    }
    public static void frequencyOfCharacter(String str){

        Map<Character, Integer> counter = new LinkedHashMap<>(); // key - each char and the value - is the frequency

        for(int i = 0; i < str.length(); i++){
            char eachChar = str.charAt(i);

            if(!counter.containsKey(eachChar)){
                counter.put(eachChar, 0);
            }
            counter.put(eachChar, counter.get(eachChar) + 1);
        }
        System.out.println(counter);
    }
}
